import java.util.Arrays;
import java.util.List;

public class Exervise {
    public static void main(String[] args) {

        List<Call> calls = Arrays.asList(
                new Call("685923584", "698584145", 100, 2, 'l'),
                new Call("659972567", "685235788", 100, 1, 'l'),
                new Call("689523488", "666988755", 500, 3, 'p'),
                new Call("625487596", "678885521", 100, 3, 'p'),
                new Call("685645158", "655895112", 500, 2, 'p')
        );

        SwitchBoard switchboard = new SwitchBoard(calls);
        SwitchBoard.getReportOfCalls();

    }
}