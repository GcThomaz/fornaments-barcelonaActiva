import java.util.Scanner;

class Methods03 {

    // Ask for a word

    public static String word(Scanner in) {

        System.out.println("Enter a word: ");
        String word = in.nextLine();
        return word.toLowerCase();
    }

    //Write the reversed word inside the String reverse

    public static String caseReverse(String word) {
        
        String reverse = "";
        for (int i = (word.length() - 1); i >= 0; i--) {
            reverse += (word).charAt(i);
        }
        return reverse.toLowerCase();
    }

    //Compare the results
    
    public static Boolean compareResults(String word, String reversed) {

        return word.equals(reversed);

    }
}
