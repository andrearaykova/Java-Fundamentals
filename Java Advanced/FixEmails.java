import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> nameAndEmail = new LinkedHashMap<>();

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("stop")) {
                break;
            }

            String email = scanner.nextLine();

            if (email.endsWith("bg")) {
                nameAndEmail.put(name, email);
            }
        }

        nameAndEmail.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " -> " + e.getValue());
        });
    }
}
