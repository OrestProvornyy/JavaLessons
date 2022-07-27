package lesson11;

import java.util.Collection;

public class L11 {
    public static void main(String[] args) {
        String sentence = "maslo, maslo, kovbasa, moloko";

        StringSetBuilder stringSetBuilder = new StringSetBuilder();

        Collection<String> wordSet = stringSetBuilder.buildSet(sentence);

        for (String word : wordSet) {
            System.out.println(word);
        }
    }
}
