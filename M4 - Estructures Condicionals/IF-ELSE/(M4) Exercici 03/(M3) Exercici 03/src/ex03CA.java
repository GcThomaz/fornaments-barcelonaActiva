import java.util.Scanner;

public class ex03CA {
    public static void main(String[] args) throws Exception {
        /*
         * Una escola d’idiomes concedeix beques a futurs estudiants si compleixen una
         * sèrie de requisits.
         * A l'alumne/a se li assigna una beca si és major d’edat i si té un títol
         * universitari. O també se li assigna una beca si l’alumne/a està a l’atur.
         * El programa demana les tres dades per pantalla i en finalitzar mostra si
         * l’alumne/a té la beca o no.
         */

        char universitari, atur;
        boolean boouniversitari, booatur;
        int edad;

        Scanner in = new Scanner(System.in);

        System.out.println("\nCONSULTA SI POTS RECBER UNA BECA\n");
        System.out.println("Escriu la teva edad: ");
        edad = in.nextInt();

        if (edad < 18) {
            System.out.println("Ho sento! Heu de ser major d'edat per rebre una beca.");
        } else {
            System.out.println("Tens un títol universitari? \nEscriviu 's' o 'n'");
            universitari = in.next().charAt(0);

            System.out.println("Estàs a l'atur?");
            atur = in.next().charAt(0);

            boouniversitari = Character.toLowerCase(universitari) == 's';

            booatur = Character.toLowerCase(atur) == 's';

            if (booatur || boouniversitari) {
                System.out.println("Felicitats! Pots rebre una beca.");
            } else {
                System.out.println("Ho sento! Necessites un titol universitari o estar a l'atur per rebre una beca.");
            }
        }

        in.close();

    }
}