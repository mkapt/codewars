package codewars.katas;

import java.util.HashSet;
import java.util.Set;

//A pangram is a sentence that contains every single letter of the alphabet at least once.
//For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
//because it uses the letters A-Z at least once (case is irrelevant).
//Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
public class DetectPangram {
    public static boolean pangram(String sentence) {

        Set<String> letters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            if((sentence.charAt(i) >= 65 && sentence.charAt(i) <= 90) || (sentence.charAt(i) >= 97 && sentence.charAt(i) <= 122))
                letters.add(String.valueOf(sentence.charAt(i)).toLowerCase());
        }

        return (letters.size() == 26 ? true : false);
    }

    public static boolean pangram2(String sentence) {
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
