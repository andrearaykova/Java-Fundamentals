import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contact = new LinkedHashMap<>();

        String info = scanner.nextLine();

        while (!"search".equals(info)) {
            String[] input = info.split("-");
            String name = input[0];
            String number = input[1];
            contact.put(name, number);

            info = scanner.nextLine();
        }

        String input = scanner.nextLine();
        while (!"stop".equals(input)) {
            if (contact.containsKey(input)) {
                System.out.println(input + " -> " + contact.get(input));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }
            input = scanner.nextLine();
        }
    }
}
