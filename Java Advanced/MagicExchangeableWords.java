import java.util.HashSet;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        HashSet<String> firstWord = new HashSet<>();
        for (int i = 0; i < input[0].length(); i++) {
            if (!firstWord.contains(String.valueOf(input[0].charAt(i)))) {
                firstWord.add(String.valueOf(input[0].charAt(i)));
            }
        }
        HashSet<String> secondWord = new HashSet<>();
        for (int i = 0; i < input[1].length(); i++) {
            if (!secondWord.contains(String.valueOf(input[1].charAt(i)))) {
                secondWord.add(String.valueOf(input[1].charAt(i)));
            }
        }

        if (firstWord.size() == secondWord.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
