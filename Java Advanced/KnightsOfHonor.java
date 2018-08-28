import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KnightsOfHonor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            System.out.println("Sir " + input[i]);
        }
    }
}
