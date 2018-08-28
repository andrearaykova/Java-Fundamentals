import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Shockwave {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] matrix = new int[n][m];

        String line = reader.readLine();

        while (!"Here we go".equalsIgnoreCase(line)) {
            int[] commands = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int x1 = commands[0];
            int y1 = commands[1];
            int x2 = commands[2];
            int y2 = commands[3];

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    matrix[i][j]++;
                }
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
