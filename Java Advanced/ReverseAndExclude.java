import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new)));

        Integer divisor = Integer.parseInt(reader.readLine());

        numbers.removeIf(x -> x % divisor == 0);
        Collections.reverse(numbers);

        numbers.forEach(x -> System.out.print(x + " "));
    }
}
