import java.util.Scanner;

public class Methods02 {
    
    //Ask for a word

    public static String typeWord(Scanner in) {

        System.out.println("Tipe a word: ");
        String word = in.nextLine();

        return word;
    }

    //Reverse the String

    public static String caseReverse02(String input) {
        
        String reverse = "";
        for (int i = (input.length() - 1); i >= 0; i--) {
            reverse += (input).charAt(i);
        }
        return reverse;
    }
}
