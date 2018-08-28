import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        fillMatrix(row, col);
    }

    public static void fillMatrix(int row, int col) {
        String[][] matrix = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String a = Character.toString((char) (i + 97));
                String b = Character.toString((char) (i + j + 97));
                String c = Character.toString((char) (i + 97));

                String all = a + b + c;
                matrix[i][j] = all;
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
