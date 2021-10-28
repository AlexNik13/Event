import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) {
        Producer producer1 = new Producer("value_up");
        Producer producer2 = new Producer("value_down");
        Producer producer3 = new Producer("Error");
        Consumer consumerUp = new Consumer("value_up") ;
        Consumer consumerDown = new Consumer("value_down") ;
        ErrorHandling errorHandling = new ErrorHandling("Error");

        ApplicationProperties applicationProperties = new ApplicationProperties(50, 20);


        int loop = 0;

        while (true){
            loop++;
            try {
                Thread.sleep(applicationProperties.getnSec());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            producer1.go();
            producer2.go();
            producer3.go();

            if(loop% 2 == 0){
                consumerUp.checkEvent();
                consumerDown.checkEvent();
            }

            errorHandling.checkEvent();

            if(ListEvent.getEvents().size() == applicationProperties.getnMassage()){
                System.out.println("List event is full");
                break;
            }
        }

        consumerUp.printMessage();
        consumerDown.printMessage();

    }
}
