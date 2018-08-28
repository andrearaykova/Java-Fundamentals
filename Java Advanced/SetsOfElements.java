import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> setForN = new LinkedHashSet<>();
        Set<Integer> setForM = new LinkedHashSet<>();

        String[] nums = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        while (n-- > 0) {
            setForN.add(scanner.nextInt());
        }
        while (m-- > 0) {
            setForM.add(scanner.nextInt());
        }

        for (Integer first : setForN) {
            for (Integer second : setForM) {
                if (first.equals(second)) {
                    System.out.print(first + " ");
                }
            }
        }
    }
}
