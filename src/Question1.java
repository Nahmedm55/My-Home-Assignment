import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Scanner;

public class Question1 {
    public static String Longest(String[] Words) {
         String longestWord = "";
        for (String word : Words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

}







