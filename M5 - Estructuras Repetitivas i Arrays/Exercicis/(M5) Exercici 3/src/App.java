import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Aquesta línia de codi:

Math.ceil((Math.random() * 10)); 
Retorna un número entre el 1 i el 10 de forma aleatòria.
L’exercici consisteix a què l’usuari/ària ha d'endevinar el número escollit aleatòriament pel programa.
El programa, demana números a l’usuari/ària fins que aquest encerti el número aleatori generat pel programa.
Un cop l’usuari/ària ha endevinat el número, es mostrarà per pantalla el següent missatge: “Enhorabona, el número era X” */

        /*Scanner in = new Scanner(System.in);

            System.out.println("Type a number betwheen 1 to 10: ");
            int number = in.nextInt();

            while (number != Math.ceil((Math.random()*10))) {
                System.out.println("Try again. Type other number: ");
                int number2 = in.nextInt();
                number = number2;
            }
            System.out.println("Nice, you got it! The number was: " + number + ".");
        in.close();*/

        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.println("Type a number betwheen 1 to 10: ");
            number = in.nextInt();
            System.out.println("Nao é esse numero!");
        } while (number != Math.ceil((Math.random()*10)));
        System.out.println("Nice, the number is: " + number);

        in.close();
    }
}
