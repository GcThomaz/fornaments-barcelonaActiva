import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * El programa demana quantes paraules vol introduir l'usuari/ària. Aquest,
         * introdueix el número i llavors apareix el següent missatge:
         * "Introdueix la paraula".
         * Aquest missatge es mostra tantes vegades com número de paraules ha dit
         * l'usuari/ària que volia introduir. Les paraules es guarden en un arrayList i
         * un cop han sigut totes introduïdes, es mostren per pantalla.
         */

        Scanner in = new Scanner(System.in);// Add the class Scanner
        System.out.println("How many words do you want to add?");// Ask how many words the user wants to add
        int number = in.nextInt();// Save the data in the variable number: type int

        ArrayList<String> words = new ArrayList<String>();// Add the class ArrayList of Strings

        for (int i = 0; i < number; i++) { // Add the loop for
            System.out.println("Add a word:");// Ask the words the user wants to add
            String word = in.next();// Save the data in the variable word: type String
            words.add(word);// Add the String to the list words
        }
        System.out.println("The words are: ");// Insert the final return text
        for (String word : words) {// Add a loop for to list all items of the list
            System.out.println(word);// Show each word of the list
        }
        in.close();// Close the class Scanner
    }
}