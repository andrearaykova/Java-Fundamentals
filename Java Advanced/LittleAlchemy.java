import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class LittleAlchemy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> stones = new ArrayDeque<>();

        int[] input = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : input) {
            stones.addLast(i);
        }

        String line = reader.readLine();
        int gold = 0;

        while (!"Revision".equalsIgnoreCase(line)) {
            String[] commands = line.split(" ");
            switch (commands[0]) {
                case "Apply":
                    int acid = Integer.parseInt(commands[2]);
                    while (acid-- > 0 && !stones.isEmpty()) {
                        int element = stones.pop();
                        if (--element <= 0) {
                            gold++;
                        } else {
                            stones.addLast(element);
                        }
                    }
                    break;
                case "Air":
                    if (gold <= 0) {
                        break;
                    }
                    gold--;
                    stones.addLast(Integer.parseInt(commands[2]));
                    break;
                default:
                    while (!stones.isEmpty()) {
                        System.out.print(stones.pop() + " ");
                    }
                    System.out.print("\n" + gold);
                    return;
            }
            line = reader.readLine();
        }
        for (Integer stone : stones) {
            System.out.print(stone + " ");
        }
        System.out.println("\n" + gold);
    }
}

