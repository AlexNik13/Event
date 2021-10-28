import java.util.Random;

public class Producer {
    private String message;

    public Producer(String message) {
        this.message = message;
    }

    public void go(){
       ListEvent.addEvents(message);
    }

}
