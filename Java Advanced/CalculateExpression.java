import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        double FfirstPart = ((a2 + b2) / (a2 - b2));
        double FsecondPArt = (a + b + c) / Math.sqrt(c);
        double f1 = Math.pow(FfirstPart, FsecondPArt);

        double F2firstPart = (a2 + b2 - Math.pow(c, 3));
        double F2secondPart = (a - b);
        double f2 = Math.pow(F2firstPart, F2secondPart);

        double avg1 = (a + b + c) / 3;
        double avg2 = (f1 + f2) / 2;
        double avg = Math.abs(avg1 - avg2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, avg);
    }
}
