import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int numOfElToPush = Integer.parseInt(input[0]);
        int numOfElToPop = Integer.parseInt(input[1]);
        int checkEl = Integer.parseInt(input[2]);

        String[] numForFill = scanner.nextLine().split("\\s+");

        ArrayDeque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < numOfElToPush; i++) {
            deque.add(numForFill[i]);
        }


        for (int i = 0; i < numOfElToPop; i++) {
            deque.poll();
        }

        if (deque.contains(Integer.toString(checkEl))) {
            System.out.println("true");
        } else if (deque.isEmpty()) {
            System.out.println("0");
        } else {
            int minNumber = Integer.MAX_VALUE;
            for (String element : deque) {
                if (Integer.parseInt(element) < minNumber) {
                    minNumber = Integer.parseInt(element);
                }
            }
            System.out.println(minNumber);
        }
    }
}

