import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        String[] tokens = scanner.nextLine().split("\\s+");

        getFirstOddOrEvenElements(numbers, Integer.parseInt(tokens[1]), tokens[2]);
    }

    private static void getFirstOddOrEvenElements(String[] numbers, int maxCount, String kindOfElement) {
        int counter = 0;

        List<String> result = new ArrayList<>();
        for (String number : numbers) {
            if (counter >= maxCount) {
                break;
            }
            if (checkKind(number, kindOfElement)) {
                result.add(number);
                counter++;
            }
        }
        System.out.println(String.join(" ", result));
    }

    private static boolean checkKind(String number, String kindOdElement) {
        if ("odd".equals(kindOdElement)) {
            return Integer.parseInt(number) % 2 != 0;
        } else {
            return Integer.parseInt(number) % 2 == 0;
        }
    }
}
