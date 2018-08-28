import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int maxScore = Integer.MIN_VALUE;
        String winner = "";
        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            int score = Integer.parseInt(scanner.nextLine());

            char[] letters = name.toCharArray();

            for (char letter : letters) {
                if (letter % 2 == 0) {
                    score += letter;
                } else {
                    score -= letter;
                }
            }
            if (maxScore < score) {
                maxScore = score;
                winner = name;
            }
        }
        if (maxScore != 0) {
            System.out.println(String.format("The winner is %s - %s points", winner, maxScore));
        }
    }
}
