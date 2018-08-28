import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String ainHexadecimal = Integer.toHexString(a).toUpperCase();
        String ainBinary = Integer.toBinaryString(a);

        while (ainHexadecimal.length() < 10) {
            ainHexadecimal = ainHexadecimal + " ";
        }
        while (ainBinary.length() < 10) {
            ainBinary = "0" + ainBinary;
        }


        System.out.print("|" + ainHexadecimal);
        System.out.print("|" + ainBinary + "|");
        System.out.printf("%10.2f", b);
        System.out.print("|");
        System.out.printf("%-10.3f", c);
        System.out.print("|");
    }
}
