package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringSetBuilder {

    public Collection<String> buildSet(String sentence) {
        String[] words = sentence.split("\\P{L}+"); //найшов в гуглі таку штуку для видалення

        List<String> wordSet = new ArrayList<>();

        for (String word : words) {
            word = capitalizeWord(word);
            if (!wordSet.contains(word)) {
                wordSet.add(word);
            }
        }

        return wordSet;
    }


    private String capitalizeWord(String word) {
        String firstLetter = word.substring(0, 1);
        String restOfWord  = word.substring(1);

        firstLetter = firstLetter.toUpperCase();
        return (firstLetter + restOfWord);
    }
}
