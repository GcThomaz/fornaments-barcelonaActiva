import java.util.Scanner;

public class ex04CAT {
    public static void main(String[] args) throws Exception {

        /*L’usuari/ària introdueix un mes per pantalla i mitjançant un switch amb els 12 mesos de l’any, el programa calcula els dies del mes i mostra el següent:
Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla: “El mes de gener té 31 dies” */

        byte mes;

        Scanner in = new Scanner(System.in);

        System.out.println("Escriu un numero entre 1 i 12: ");
        mes = in.nextByte();

        switch (mes) {
            case 1:
                System.out.println("Gener! Té 31 dies.");
                break;
            case 2:
                System.out.println("Feber! Té 31 dies..");
                break;
            case 3:
                System.out.println("Març! It has 31 days.");
                break;
            case 4:
                System.out.println("Abril! It has 30 days.");
                break;
            case 5:
                System.out.println("Maig! It has 31 days.");
                break;
            case 6:
                System.out.println("Juny! It has 30 days.");
                break;
            case 7:
                System.out.println("Julyol! It has 31 days.");
                break;
            case 8:
                System.out.println("Agost! It has 30 days.");
                break;
            case 9:
                System.out.println("Setembre! It has 31 days.");
                break;
            case 10:
                System.out.println("Octubre! It has 30 days.");
                break;
            case 11:
                System.out.println("Novembre! It has 31 days.");
                break;
            case 12:
                System.out.println("Decembre! It has 30 days.");
                break;
        }
        in.close();
    }
}
