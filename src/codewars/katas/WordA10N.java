package codewars.katas;

//The word i18n is a common abbreviation of internationalization in the developer community,
// used instead of typing the whole word and trying to spell it correctly.
// Similarly, a11y is an abbreviation of accessibility. Write a function that takes a string and
// turns any and all "words" (see below) within that string of length 4 or greater into an abbreviation, following these rules:
//A "word" is a sequence of alphabetical characters. By this definition, any other character
// like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
//The abbreviated version of the word should have the first letter,
//then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
public class WordA10N {

    public static void main(String[] args) {
        System.out.println(abbreviate("sits, mat; mat'sits, sat"));
    }

    public static String abbreviate(String string) {
        String[] words = string.split("[^A-Za-z]");

        StringBuilder sb = new StringBuilder();
        String word = new String();
        for (int i = 0; i < string.length(); i++) {
            if(String.valueOf(string.charAt(i)).matches("[A-Za-z]")) {
                word = word + string.charAt(i);
            } else {
                if(!word.isEmpty() && word.length() >= 4) {
                    //it apppends the first letter + sum of chars between the first and last chars + the last letter
                    sb.append(word.charAt(0))
                      .append(word.substring(1, word.length()-1).length())
                      .append(word.charAt(word.length()-1));
                } else if(!word.isEmpty() && word.length() < 4) {
                    sb.append(word);
                }

                //it appends the end-of-word character
                sb.append(string.charAt(i));

                word = new String();
            }

            if(i == string.length()-1 && word.length() > 0) {
                if(word.length() >= 4) {
                    sb.append(word.charAt(0))
                      .append(word.substring(1, word.length()-1).length())
                      .append(word.charAt(word.length()-1));
                } else {
                    sb.append(word);
                }
            }
        }

        //for cases where string is just a single word
        if(sb.length() == 0) {
            if(word.length() >= 4) {
                sb.append(word.charAt(0))
                   .append(word.substring(1, word.length()-1).length())
                   .append(word.charAt(word.length()-1));
            } else {
                sb.append(word);
            }
        }

        return sb.toString();
    }
}
