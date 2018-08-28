import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NatureProphet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] matrix = new int[n][m];

        String line = reader.readLine();

        while (!"Bloom Bloom Plow".equalsIgnoreCase(line)) {
            int[] commands = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int x1 = commands[0];
            int y1 = commands[1];


            for (int i = 0; i < matrix[x1].length; i++) {
               if (i != y1){
                   matrix[x1][i] += 1;
               }
            }

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][y1] += 1;
            }
            line = reader.readLine();
        }

        for (int[] c : matrix) {
            for (int i : c) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}



