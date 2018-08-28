import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int num = Integer.parseInt(input[0]);
        String word = input[1];
        int[][] matrix = new int[num][num];

        typeFill(word, num, matrix);

    }

    public static void typeFill(String word, int num, int[][] matrix) {
        int counter = 1;

        if (word.equals("A")) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    matrix[j][i] = counter;
                    counter++;
                }
            }
        } else if (word.equals("B")) {
            for (int i = 0; i < num; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < num; j++) {
                        matrix[j][i] = counter;
                        counter++;
                    }
                }
                if (i % 2 == 1) {
                    for (int j = num - 1; j >= 0; j--) {
                        matrix[j][i] = counter;
                        counter++;
                    }
                }

            }
        }
        printMatrix(matrix);
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

