import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String string = scanner.nextLine();

        while (!string.equals("end")) {
            if (Pattern.matches(regex,string)) {
                System.out.println(string);
            }
            string = scanner.nextLine();
        }
    }
}

