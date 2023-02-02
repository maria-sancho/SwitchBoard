import java.util.List;

public class SwitchBoard {
    private static List<Call> calls;

    public SwitchBoard(List<Call> calls) {
        this.calls = calls;
    }

    public List<Call> getCalls() {
        return calls;
    }

    private void print(){
        for (Call call : calls) {
            System.out.println(call.toString());
        }
    }

    public static void getReportOfCalls(){
        double cost = 0;
        int totalNumberOfCalls = 0;

        for (Call call : calls) {
            cost += call.getCost();
            totalNumberOfCalls++;
        }
        System.out.println("Total number of calls: " + totalNumberOfCalls + " and the total turnover is: " +  cost + " cents.");
    }
}