import java.util.Scanner;

public class ex01EN {
    public static void main(String[] args) throws Exception {
        /*
         * Modifica l’exercici 1 del mòdul 3. Un cop introduïdes les dades, el programa
         * ha de mostrar el següent per pantalla:
         * - Si l’usuari/ària té 18 anys o més: “Nom Cognom, ets MAJOR d’edat”
         * - Si l’usuari/ària és menor de 18 anys: “Nom Cognom, ets MENOR d’edat”.
         */

        String name, lastName;
        int age;

        Scanner in = new Scanner(System.in);

        System.out.println("Type your name: ");
        name = in.nextLine();
        System.out.println("Type your last name: ");
        lastName = in.nextLine();
        System.out.println("Type your age: ");
        age = in.nextInt();

        if (age >= 18) {
            System.out.println(name + " " + lastName + ", have legal age.");
        } else {
            System.out.println(name + " " + lastName + ", do not have legal age.");
        }

        in.close();
    }
}
