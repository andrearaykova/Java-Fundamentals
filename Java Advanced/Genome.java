import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Genome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> input = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile("([a-z!@#$?]+)=([0-9]+)--([0-9]+)<<([a-z]+)");

        String line = reader.readLine();
        while (!"Stop!".equals(line)) {
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String name = matcher.group(1);
                name = matcher.group(1).replaceAll("[!@#$?]", "");

                if (name.length() == Integer.parseInt(matcher.group(2))) {
                    if (input.isEmpty() || !input.containsKey(matcher.group(4))) {
                        input.put(matcher.group(4), Integer.parseInt(matcher.group(3)));
                    } else if (input.containsKey(matcher.group(4))) {
                        int count = input.containsKey(matcher.group(4)) ? input.get(matcher.group(4)) : 0;
                        input.put(matcher.group(4), count + Integer.parseInt(matcher.group(3)));
                    }

                }
            }
            line = reader.readLine();
        }

        Map<String, Integer> sortedTeamsByScore = new LinkedHashMap<String, Integer>();
        sortedTeamsByScore = input.entrySet().stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        }).collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));

        for (Map.Entry e : sortedTeamsByScore.entrySet()) {
            System.out.println(e.getKey() + " has genome size of " + e.getValue());
        }
    }
}









