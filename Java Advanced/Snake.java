import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int length = 1;

        String[] commands = reader.readLine().split(", ");

        String[][] matrix = new String[n][n];
        int[] start = new int[2];

        int col = 0;
        int row = 0;

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");

            for (int j = 0; j < line.length; j++) {
                if (line[j].equals("s")) {
                    row = i;
                    col = j;
                }
            }
            matrix[i] = line;
        }

        for (String command : commands) {
            switch (command) {
                case "up":
                    if (row > 0) {
                        row--;
                    } else {
                        row = n - 1;
                    }
                    break;
                case "right":
                    if (col < n - 1) {
                        col++;
                    } else {
                        col = 0;
                    }
                    break;
                case "left":
                    if (col > 0) {
                        col--;
                    } else {
                        col = n - 1;
                    }
                    break;
                case "down":
                    if (row < n - 1) {
                        row++;
                    } else {
                        row = 0;
                    }
                    break;
            }
            if (matrix[row][col].equals("f")) {
                length++;
                matrix[row][col] = "*";
            } else if (matrix[row][col].equals("e")) {
                System.out.println("You lose! Killed by an enemy!");
                return;
            }
        }

        int food = 0;
        for (String[] strings : matrix) {
            for (String string : strings) {
                if ("f".equals(string)) {
                    food++;
                }
            }
        }

        if (food == 0) {
            System.out.printf("You win! Final snake length is %s", length);
        } else {
            System.out.printf("You lose! There is still %s food to be eaten.", food);
        }
    }
}


