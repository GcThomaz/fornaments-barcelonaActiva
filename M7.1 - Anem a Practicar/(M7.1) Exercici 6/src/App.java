import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*L’usuari/ària introduirà un número (de l'1 al 10) per pantalla, i utilitzant un bucle, el programa li mostrarà la taula de multiplicar d’aquell número. */

        int number = askInt("Type a number: ");
        tabuada(number);
    }

    static void tabuada(int number) {
            System.out.println("Table of multiply of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }

    static int askInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        //in.close();
        return in.nextInt();
    }
}
