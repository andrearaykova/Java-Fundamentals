import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int sum = 0;
        int[][] resultMatrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int sum2 = 0;
                int[][] miniMatrix = new int[3][3];
                int k1 = i + 3;
                int l1 = j + 3;

                if (i + 3 >= matrix.length) {
                    k1 = matrix.length;
                }
                for (int k = i; k < k1; k++) {
                    if (j + 3 >= matrix[i].length) {
                        l1 = matrix[i].length;
                    }
                    for (int l = j; l < l1; l++) {
                        sum2 += matrix[k][l];
                        miniMatrix[k - i][l - j] = matrix[k][l];
                    }
                }
                if (sum2 > sum) {
                    sum = sum2;
                    resultMatrix = miniMatrix;
                }
            }
        }
        System.out.printf("Sum = %d\n", sum);
        printMatrix(resultMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}






