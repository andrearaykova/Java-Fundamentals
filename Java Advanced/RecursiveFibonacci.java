import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Long.parseLong(scanner.nextLine());

        System.out.println(Fibonacci(number + 1));
    }

    private static long Fibonacci(long number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        }
    }
}
