import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> usernames = new LinkedHashSet<>();

        int num = Integer.parseInt(scanner.nextLine());

        while (num-- > 0) {
            String name = scanner.nextLine();
            usernames.add(name);
        }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
