import java.util.ArrayList;

public class ErrorHandling {
    private String report;
    public ErrorHandling(String report) {
        this.report = report;
    }


    public void checkEvent(){
        for (int i = 0; i < ListEvent.getEvents().size(); i++){
            if(ListEvent.getEvents().get(i).getMassage().equalsIgnoreCase(report)){
                System.out.println(ListEvent.getEvents().get(i).toString());
                ListEvent.getEvents().remove(i) ;
                break;
            }
        }
    }
}
