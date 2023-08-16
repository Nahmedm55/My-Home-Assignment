import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Please select the the number of the required assignment to run :\n" +
                    "1: Find Longest String\n" +
                    "2: Remove non English letters\n" +
                    "3: Reverse String");
            String QNumber = scanner.nextLine();
            int QNumber_converted = Integer.parseInt(QNumber);
            switch (QNumber_converted) {

                case 1:
                    //Number of Words
                    System.out.println("How many words do you have?: ");
                    String NumberOfWords = scanner.nextLine();
                    int NumberOfWordsConv = Integer.parseInt(NumberOfWords);
                    String[] words = new String[NumberOfWordsConv];
                    System.out.println("Enter the " + NumberOfWords + " words separately by pressing Enter key after each.");
                    for (int i = 0; i < NumberOfWordsConv; i++) {
                        words[i] = scanner.nextLine();
                    }

                    for (String word : words) {

                    }
                    Question1 q1 = new Question1();
                    System.out.println("Longest text is: " + q1.Longest(words));
                    // How many letters

                    System.out.println("String length: " + q1.Longest(words).length());
                    break;
                case 2:
                    System.out.println("Please enter your input ");
                    String input = scanner.nextLine();
                    //String input= ("Autíčko");
                    Ddiacritics dd = new Ddiacritics();
                    System.out.println(dd.correction(input));
                    break;
                // Final reverse
                case 3:
                    Reverse_process finalReversedsrtring = new Reverse_process();
                    System.out.println("Please enter the sentence you want to reverse : ");
                    String Revers = scanner.nextLine();
                    System.out.println(finalReversedsrtring.ProcessReverse(Revers));

                    break;
            }
        }
    }
}




