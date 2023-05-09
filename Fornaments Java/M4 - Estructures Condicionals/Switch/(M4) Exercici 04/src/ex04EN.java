import java.util.Scanner;

public class ex04EN {
    public static void main(String[] args) throws Exception {

        /*L’usuari/ària introdueix un mes per pantalla i mitjançant un switch amb els 12 mesos de l’any, el programa calcula els dies del mes i mostra el següent:
Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla: “El mes de gener té 31 dies” */

        byte month;

        Scanner in = new Scanner(System.in);

        System.out.println("Type a number betwheen 1 and 12: ");
        month = in.nextByte();

        switch (month) {
            case 1:
                System.out.println("You choose January! It has 31 days.");
                break;
            case 2:
                System.out.println("You choose February! It has 28 days.");
                break;
            case 3:
                System.out.println("You choose March! It has 31 days.");
                break;
            case 4:
                System.out.println("You choose April! It has 30 days.");
                break;
            case 5:
                System.out.println("You choose May! It has 31 days.");
                break;
            case 6:
                System.out.println("You choose June! It has 30 days.");
                break;
            case 7:
                System.out.println("You choose July! It has 31 days.");
                break;
            case 8:
                System.out.println("You choose August! It has 30 days.");
                break;
            case 9:
                System.out.println("You choose September! It has 31 days.");
                break;
            case 10:
                System.out.println("You choose October! It has 30 days.");
                break;
            case 11:
                System.out.println("You choose November! It has 31 days.");
                break;
            case 12:
                System.out.println("You choose December! It has 30 days.");
                break;
        }
        in.close();
    }
}
