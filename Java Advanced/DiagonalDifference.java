import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfMatrix = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        int firstDiagonalRow = 0;
        int firstDiagonalCol = 0;

        int secondDiagonalRow = 0;
        int secondDiagonalCol = matrix.length - 1;

        while (true) {
            if (firstDiagonalRow >= matrix.length) {
                break;
            }
            firstDiagonal += matrix[firstDiagonalRow][firstDiagonalCol];
            secondDiagonal += matrix[secondDiagonalRow][secondDiagonalCol];
            firstDiagonalRow++;
            firstDiagonalCol++;

            secondDiagonalRow++;
            secondDiagonalCol--;
        }

        int result = Math.abs(firstDiagonal - secondDiagonal);
        System.out.println(result);
    }
}
