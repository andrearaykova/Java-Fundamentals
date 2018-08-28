import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);

        String oddOrEven = reader.readLine();

        for (int i = first; i <= second; i++) {
            if ("even".equals(oddOrEven) && i % 2 == 0) {
                System.out.print(i + " ");
            } else if ("odd".equals(oddOrEven) && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
