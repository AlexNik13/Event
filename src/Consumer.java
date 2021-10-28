import java.util.ArrayList;

public class Consumer {
    private String report;
    private ArrayList<Message> messages;
    public Consumer(String report) {
        this.report = report;
        messages = new ArrayList<>();
    }


    public void checkEvent(){
        for (int i = 0; i < ListEvent.getEvents().size(); i++){
            if(ListEvent.getEvents().get(i).getMassage().equalsIgnoreCase(report)){
                messages.add(ListEvent.getEvents().remove(i)) ;
                break;
            }
        }
    }

    public void printMessage(){
        for (Message message : messages){
            System.out.println(message.toString());
        }
    }
}
