import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int num : input) {
            stack.push(num);
        }
        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }
}
