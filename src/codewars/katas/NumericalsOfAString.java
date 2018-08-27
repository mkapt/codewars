package codewars.katas;

import java.util.HashMap;
import java.util.Map;

public class NumericalsOfAString {

    public static void main(String[] args) {
        System.out.println(numericals("Hello, World!"));
    }

    public static String numericals(String s) {
        Map<Character, Integer> occurrences = new HashMap<>();
        s.chars().forEach(c-> occurrences.put((char) c, 0));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            occurrences.put(s.charAt(i), occurrences.get(s.charAt(i))+1);
            result.append(String.valueOf(occurrences.get(s.charAt(i))));
        }

        return result.toString();
    }
}
