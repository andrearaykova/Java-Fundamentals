import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        String[][] matrix = fillMatrix(row, col, scanner);

        boolean isTrue = true;
        while (isTrue) {
            String[] line = scanner.nextLine().split("\\s+");
            if (line[0].equals("END")){
                isTrue = false;
                break;
            }

            if (line[0].equals("swap")) {
                try {
                    int num1 = Integer.parseInt(line[1]);
                    int num2 = Integer.parseInt(line[2]);
                    int num3 = Integer.parseInt(line[3]);
                    int num4 = Integer.parseInt(line[4]);


                    String save = matrix[num1][num2];
                    matrix[num1][num2] = matrix[num3][num4];
                    matrix[num3][num4] = save;
                    printMatrix(matrix);
                }
                catch(Exception e){
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");

            }
        }

    }

    private static String[][] fillMatrix(int row, int col, Scanner scanner) {
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = line[j];
            }
        }
        return matrix;
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






