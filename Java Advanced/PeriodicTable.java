import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> elements = new TreeSet<>();

        int num = Integer.parseInt(scanner.nextLine());

        while (num-- > 0) {
            String[] el = scanner.nextLine().split(" ");
            for (int i = 0; i < el.length; i++) {
                elements.add(el[i]);
            }
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
