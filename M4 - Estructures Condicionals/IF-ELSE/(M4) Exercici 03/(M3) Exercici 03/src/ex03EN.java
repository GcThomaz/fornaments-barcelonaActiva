import java.util.Scanner;

public class ex03EN {
    public static void main(String[] args) throws Exception {
        /*
         * Una escola d’idiomes concedeix beques a futurs estudiants si compleixen una
         * sèrie de requisits.
         * A l'alumne/a se li assigna una beca si és major d’edat i si té un títol
         * universitari. O també se li assigna una beca si l’alumne/a està a l’atur.
         * El programa demana les tres dades per pantalla i en finalitzar mostra si
         * l’alumne/a té la beca o no.
         */

        char univertity, unemployment;
        boolean booUnivertity, booUnemployment;
        int legalAge;

        Scanner in = new Scanner(System.in);

        System.out.println("\nCHECK IF YOU CAN RECEIVE A SCHOOLARSHIP\n");
        System.out.println("Type your age: ");
        legalAge = in.nextInt();

        if (legalAge < 18) {
            System.out.println("Sorry! You must be of legal age to receive a schoolarship.");
        } else {
            System.out.println("Do you have an university degree? \nType 's' or 'n'");
            univertity = in.next().charAt(0);

            System.out.println("Are you unemployed?");
            unemployment = in.next().charAt(0);

            booUnivertity = Character.toLowerCase(univertity) == 's';

            booUnemployment = Character.toLowerCase(unemployment) == 's';

            if (booUnemployment || booUnivertity) {
                System.out.println("Congrats! You won an schoolarship.");
            } else {
                System.out.println("Sorry! You need an university certificate or be unemployed.");
            }
        }

        in.close();

    }
}