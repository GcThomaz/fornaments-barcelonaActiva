import java.util.Scanner;

public class ex02CA {
    public static void main(String[] args) throws Exception {
        /*
         * Aquest programa li demana l’edat a l’usuari/ària, en funció d’aquesta,
         * mostrarem un dels següents missatges per pantalla:
         * Si té 5 anys o menys: preescolar.
         * Si té entre 6 i 11 anys: primària.
         * Si té entre 12 i 15: ESO.
         * Si té entre 16 i 17: Batxillerat.
         * Si és major d'edat: FP o Universitat.
         */

        int edad;

        Scanner in = new Scanner(System.in);

        System.out.println("Escriu la teva edad: ");
        edad = in.nextInt();

        if (edad <= 5) {
            System.out.println("Preescolar.");
        } else if (edad <= 11) {
            System.out.println("Primaria.");
        } else if (edad <= 15) {
            System.out.println("ESO.");
        } else if (edad <= 17) {
            System.out.println("Batxillerat.");
        } else if (edad >= 18) {
            System.out.println("FP o Universitat.");
        }
        in.close();

    }
}