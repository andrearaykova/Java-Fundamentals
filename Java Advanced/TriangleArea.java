import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Ax = scanner.nextInt();
        int Ay = scanner.nextInt();
        scanner.nextLine();
        int Bx = scanner.nextInt();
        int By = scanner.nextInt();
        scanner.nextLine();
        int Cx = scanner.nextInt();
        int Cy = scanner.nextInt();

        int area = ((Ax * (By - Cy)) + (Bx * (Cy - Ay)) + (Cx * (Ay - By))) / 2;

        System.out.println(Math.abs(area));

    }
}
