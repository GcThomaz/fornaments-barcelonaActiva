import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*<Has de modificar el programa anterior per afegir una nova funcionalitat: establir un número màxim de 5 intents.

Si l’usuari/ària encerta el número escollit pel programa abans d'aquests 5 intents, el programa mostra el següent missatge per pantalla: “Enhorabona, el número és X i has necessitat Y intents per encertar-lo”.

Si no encerta el número abans de 5 intents, el programa mostra per pantalla: "Has utilitzat massa intents! El número és X ". */

        Scanner in = new Scanner(System.in);
        int number;
        int attempts = 0;
        int random = (int) Math.ceil((Math.random()*10));    

            do {
                System.out.println("Type a number betwheen 1 to 10: ");
                number = in.nextInt();
                attempts++;
            } while (number != random && attempts < 5);
            if (number == random) {
                System.out.println("Congrats! Tha number was: " + number);
            } else {
                System.out.println("Game over! The number was: " + number);
            }
            System.out.println("Attempts: " + attempts);     

        in.close();
    }
}
