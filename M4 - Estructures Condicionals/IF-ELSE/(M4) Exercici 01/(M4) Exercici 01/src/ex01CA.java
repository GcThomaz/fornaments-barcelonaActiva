import java.util.Scanner;

public class ex01CA {
    public static void main(String[] args) throws Exception {
        /*
         * Modifica l’exercici 1 del mòdul 3. Un cop introduïdes les dades, el programa
         * ha de mostrar el següent per pantalla:
         * - Si l’usuari/ària té 18 anys o més: “Nom Cognom, ets MAJOR d’edat”
         * - Si l’usuari/ària és menor de 18 anys: “Nom Cognom, ets MENOR d’edat”.
         */

        String nom, cognom;
        int edad;

        Scanner in = new Scanner(System.in);

        System.out.println("Escriu el teu nom: ");
        nom = in.nextLine();
        System.out.println("Escriu el teu cognom: ");
        cognom = in.nextLine();
        System.out.println("Escriu la teva edad: ");
        edad = in.nextInt();

        if (edad >= 18) {
            System.out.println(nom + " " + cognom + ", ets major d'edad.");
        } else {
            System.out.println(nom + " " + cognom + ", ets menor d'edad.");
        }

        in.close();
    }
}
