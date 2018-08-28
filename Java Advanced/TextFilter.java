import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] badWords = scanner.nextLine().split(",| ");

        String text = scanner.nextLine();


        for (String badWord : badWords) {
            if (text.contains(badWord)){

                text = text.replaceAll(badWord,
                        new String(new char[badWord.length()]).replace('\0','*'));
            }
        }
        System.out.println(text);
    }
}

