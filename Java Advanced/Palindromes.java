import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new TreeSet<>();
        String[] text = scanner.nextLine().split("[,.?! ]");

        for (int i = 0; i < text.length ; i++) {
            String reverse = new StringBuilder(text[i]).reverse().toString();
            if (text[i].equals(reverse) && !text[i].equals("")){
                set.add(reverse);
            }
        }
        System.out.println(set.toString());
    }
}
