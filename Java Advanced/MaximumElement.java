import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> elements = new ArrayDeque<>();
        ArrayDeque<Integer> ordered = new ArrayDeque<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            if(input.length() == 1){
                if(input.equals("2")){
                    if(!elements.isEmpty()){
                        ordered.remove(elements.peek());
                        elements.pop();
                    }
                } else if(input.equals("3")){
                    System.out.println(ordered.peek());
                }
            } else {
                if(input.split(" ")[0].equals("1")){
                    int num = Integer.parseInt(input.split(" ")[1]);
                    elements.push(num);
                    if(ordered.isEmpty() || ordered.peek() <= num){
                        ordered.push(num);
                    } else {
                        ordered.addLast(num);
                    }
                }
            }
        }
    }
}