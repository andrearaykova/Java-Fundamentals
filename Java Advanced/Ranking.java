import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Ranking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Map<String, HashMap<String, Integer>> set2 = new TreeMap<>();
        Map<String, String> set1 = new HashMap<>();
        int pts = 0;
        String winner = "";

        while (!"end of contests".equals(input)) {
            String[] tokens = input.split(":");
            set1.put(tokens[0], tokens[1]);
            input = reader.readLine();
        }

        input = reader.readLine();
        while (!"end of submissions".equals(input)) {
            String[] tokens = input.split("=>");
            int currentPoints = Integer.parseInt(tokens[3]);

            if (set1.keySet().contains(tokens[0])) {
                if (set1.get(tokens[0]).equals(tokens[1])) {
                    if (!set2.keySet().contains(tokens[2])) {
                        set2.put(tokens[2], new HashMap<>());
                        set2.get(tokens[2]).put(tokens[0], currentPoints);
                        set2.get(tokens[2]).put("pts", currentPoints);
                    } else {
                        if (!(set2.get(tokens[2]).keySet().contains(tokens[0]))) {
                            set2.get(tokens[2]).put(tokens[0], currentPoints);
                            set2.get(tokens[2]).put("pts", set2.get(tokens[2]).get("pts") + currentPoints);
                        } else if (set2.get(tokens[2]).get(tokens[0]) < currentPoints) {
                            int diff = currentPoints - set2.get(tokens[2]).get(tokens[0]);
                            set2.get(tokens[2]).put("pts", set2.get(tokens[2]).get("pts") + diff);
                            set2.get(tokens[2]).put(tokens[0], currentPoints);
                        }
                    }
                }
            }
            input = reader.readLine();
        }
        for (String s : set2.keySet()) {
            if (set2.get(s).get("pts") > pts) {
                pts = set2.get(s).get("pts");
                winner = s;
            }
        }
        System.out.printf("Best candidate is %s with total %d points.\n", winner, pts);
        System.out.println("Ranking: ");

        for (String s : set2.keySet()) {
            System.out.println(s);
            Map<String, Integer> sorted = set2.get(s).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
            for (String cont : sorted.keySet()) {
                if (!cont.equals("pts")) {
                    System.out.printf("#  %s -> %d\n", cont, sorted.get(cont));
                }
            }
        }
    }
}





