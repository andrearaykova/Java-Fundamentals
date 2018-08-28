import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> minerTask = new LinkedHashMap<>();

        while (true) {
            String resource = scanner.nextLine();

            if (resource.equals("stop")) {
                break;
            }

            Integer quantity = Integer.parseInt(scanner.nextLine());

            if (!minerTask.containsKey(resource)) {
                minerTask.put(resource, quantity);
            } else {
                minerTask.put(resource, minerTask.get(resource) + quantity);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : minerTask.entrySet()) {
            System.out.printf("%s -> %d\n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
    }
}

