import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        Predicate<String> checkLength = string -> string.length() <= number;

        String[] input = reader.readLine().split(" ");

        Consumer<String> print = System.out::println;

        for (String word : input) {
            if (checkLength.test(word)) {
                print.accept(word);
            }
        }
    }
}
