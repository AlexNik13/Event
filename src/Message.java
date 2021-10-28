import java.time.LocalTime;

public class Message {
    private String massage;
    private LocalTime localTime;

    public Message(String massage) {
        this.massage = massage;
        this.localTime = LocalTime.now();
    }

    public String getMassage() {
        return massage;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    @Override
    public String toString(){
        return "Message: " + massage+ ". Time: " + localTime;
    }
}
