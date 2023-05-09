import java.util.Scanner;

public class ex03CA {
    public static void main(String[] args) {
        
        /*El programa demana a l'usuari/ària que introdueixi 3 notes i el programa mostra la mitja de les 3 notes per pantalla. */

        int notes1, notes2, notes3;
        float mitja;

            Scanner in = new Scanner(System.in);

                System.out.println("Escriu la primera note: ");
                notes1 = in.nextInt();
                System.out.println("Escriu la segona note: ");
                notes2 = in.nextInt();
                System.out.println("Escriu la tercera note: ");
                notes3 = in.nextInt();

                mitja = (notes1 + notes2 + notes3) / 3;

                System.out.println("La mitjana de les tevas notes és: " + mitja + ".");

            in.close();
    }
}
