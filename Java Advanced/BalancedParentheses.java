import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBalanced(String input) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char parenthesis = input.charAt(i);
            if (parenthesis == '[' || parenthesis == '(' || parenthesis == '{') {
                stack.addFirst(parenthesis);
            } else {
                if (!stack.isEmpty()) {
                    char first = stack.pop();
                    if (first == '{') {
                        if (parenthesis != '}') {
                            return false;
                        }
                    } else if (first == '[') {
                        if (parenthesis != ']') {
                            return false;
                        }
                    } else if (first == '(') {
                        if (parenthesis != ')') {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

