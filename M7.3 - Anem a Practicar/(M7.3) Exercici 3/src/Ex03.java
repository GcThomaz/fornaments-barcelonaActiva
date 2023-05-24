import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        /*
         * L’usuari/ària ha d’introduir una frase i el programa ha de dir si la frase és
         * un palíndrom.
         */

        Scanner in = new Scanner(System.in);

        String word = Methods03.word(in);
        String reversed = Methods03.caseReverse(word);

        boolean areEqual = Methods03.compareResults(word, reversed);

        if (areEqual) {
            System.out.printf("The word %s is palindrome. (%s = %s)\n", word, word, reversed);
        } else {
            System.out.printf("The word %s isn't palindrome. (%s != %s)\n", word, word, reversed);
        }
        in.close();
    }
}
