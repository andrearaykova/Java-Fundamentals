import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int numOfElToPush = Integer.parseInt(input[0]);
        int numOfElToPop = Integer.parseInt(input[1]);
        int checkEl = Integer.parseInt(input[2]);

        int[] numForFill = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int num : numForFill) {
            stack.push(num);
        }


        for (int i = 0; i < numOfElToPop; i++) {
            stack.pop();
        }

        if (stack.contains(checkEl)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            int minNumber = Integer.MAX_VALUE;
            for (int element : stack) {
                if (element < minNumber) {
                    minNumber = element;
                }
            }
            System.out.println(minNumber);
        }
    }
}
