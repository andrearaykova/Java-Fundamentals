import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }

        System.out.println(Collections.min(numbers));
    }
}
