import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {

    /*En aquest programa l’usuari/ària ha d’introduir un string i el programa ha de mostrar l’string al revés. */

        Scanner in = new Scanner(System.in);

        String word = Methods02.typeWord(in);
        String reversed = Methods02.caseReverse02(word);

        System.out.printf("The word %s reversed is: %s.\n",word, reversed);
        
        in.close();
    }
}
