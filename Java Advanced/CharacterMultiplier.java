import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        int sum = 0;
        int totalSum = 0;

        for (int i = 0; i < first.length(); i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        if (first.length() > second.length()){
            String remainder = first.substring(second.length());
            for (int i = 0; i < remainder.length(); i++) {
                totalSum += remainder.charAt(i);
            }
        } else  if(second.length() > first.length()) {
            String remainder = second.substring(first.length());
            for (int i = 0; i < remainder.length(); i++) {
                totalSum += remainder.charAt(i);
            }
        }

        sum += totalSum;
        System.out.println(sum);
    }
}

//public class CharacterMultiplier {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));;
//
//        String[] input = reader.readLine().split("\\s+");
//        char[] first = input[0].toCharArray();
//        char[] second = input[1].toCharArray();
//
//        int result = 0;
//
//        for (int i = 0; i < Math.max(first.length, second.length); i++) {
//            if (i < first.length && i < second.length) {
//                result += first[i] * second[i];
//            } else if (i < first.length) {
//                result += first[i];
//            } else if (i < second.length) {
//                result += second[i];
//            }
//        }
//
//        System.out.println(result);
//    }
//}