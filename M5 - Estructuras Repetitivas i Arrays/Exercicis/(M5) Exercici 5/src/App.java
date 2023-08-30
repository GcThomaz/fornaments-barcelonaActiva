import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Has de modificar el programa de les beques (M4 Exercici 3)
         * 
         * Ara el programa ha de poder donar 5 beques.
         * 
         * El programa anirà demanant les dades dels/les alumnes fins que es donin
         * aquestes 5 beques. Un cop el programa hagi assignat les 5 beques s’ha de
         * mostrar per pantalla els noms dels/les 5 alumnes que tenen beca.
         * 
         */
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> noBecas = new ArrayList<String>();
        char univertity, unemployment;
        boolean booUnivertity, booUnemployment;
        int legalAge;
        String name;

        do {
            System.out.println("Type your name: ");
            name = in.nextLine();

            System.out.println("Type your age: ");
            legalAge = in.nextInt();

            System.out.println("Do you have an university degree? \nType 's' or 'n'");
            univertity = in.next().charAt(0);

            System.out.println("Are you unemployed?");
            unemployment = in.next().charAt(0);

            booUnivertity = Character.toLowerCase(univertity) == 's';

            booUnemployment = Character.toLowerCase(unemployment) == 's';

            if (legalAge >= 18 && (booUnemployment || booUnivertity)) {
                names.add(name);
            } else {
                noBecas.add(name);
            }
            in.nextLine();
        } while (names.size() < 5); //Indeterminado
        System.out.println("\nCongrats! You won the scholarship: ");
        for (String nom : names) {
            System.out.println(nom);
        }
        System.out.println("\nList of those who did not get the scholarship: ");
        for (String noNom : noBecas) {
            System.out.println(noNom);
        }
        System.out.println("Sorry! You didn't meet all the requirements!");
        in.close();
    }
}