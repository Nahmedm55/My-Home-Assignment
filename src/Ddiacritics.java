import java.text.Normalizer;
import java.util.Scanner;

public class Ddiacritics {
    public static String correction(String input){
        String Normalized = Normalizer.normalize( input, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        return Normalized;
    }

}
