import java.io.IOException;
import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, HashSet<String>> HandsOfCards = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {

            String[] inputSplit = input.split(":");
            String name = inputSplit[0];
            String[] cards = inputSplit[1].trim().split(", ");

            if (!HandsOfCards.containsKey(name)) {

                HandsOfCards.put(name, new HashSet<String>());
            }
            for (int i = 0; i < cards.length; i++) {

                HandsOfCards.get(name).add(cards[i]);

            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, HashSet<String>> item : HandsOfCards.entrySet()) {

            int allSum = 0;

            for (String cards : item.getValue()) {

                String power = cards.substring(0, cards.length() - 1);
                String type = cards.substring(cards.length() - 1);

                int sum = powerCards(power) * Type(type);
                allSum += sum;

            }
            System.out.println(item.getKey() + ": " + allSum);
        }
    }

    static int powerCards(String power) {
        LinkedHashMap<String, Integer> cardResult = new LinkedHashMap<>();

        cardResult.put("2", 2);
        cardResult.put("3", 3);
        cardResult.put("4", 4);
        cardResult.put("5", 5);
        cardResult.put("6", 6);
        cardResult.put("7", 7);
        cardResult.put("8", 8);
        cardResult.put("9", 9);
        cardResult.put("10", 10);
        cardResult.put("J", 11);
        cardResult.put("Q", 12);
        cardResult.put("K", 13);
        cardResult.put("A", 14);


        return cardResult.get(power);
    }

    static Integer Type(String type) {
        LinkedHashMap<String, Integer> typeResult = new LinkedHashMap<>();

        typeResult.put("S", 4);
        typeResult.put("H", 3);
        typeResult.put("D", 2);
        typeResult.put("C", 1);

        return typeResult.get(type);
    }
}