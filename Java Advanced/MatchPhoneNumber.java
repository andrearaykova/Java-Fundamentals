import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";
        String string = scanner.nextLine();

        while (!string.equals("end")) {
            if (Pattern.matches(regex,string)) {
                System.out.println(string);
            }
            string = scanner.nextLine();
        }
    }
}
