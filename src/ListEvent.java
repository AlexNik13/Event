import java.util.ArrayList;
import java.util.PrimitiveIterator;

public final class ListEvent {

    private static ArrayList<Message> events = new ArrayList<>();

    private ListEvent() {
    }

    public static void addEvents(String message) {
        events.add(new Message(message));
    }

    public static ArrayList<Message> getEvents() {
        return events;
    }
}
