import java.util.Scanner;

public class ex03EXTRAEN {
    public static void main(String[] args) throws Exception {
        /*
         * Escriu un programa Java que calculi els litres de pintura necessaris per a
         * pintar una paret rectangular.
         * Un litre de pintura cobreix aproximadament, 12 m² en una sola mà.
         * Crea una constant anomenada coberturaLitro per a guardar la dada de cobertura
         * de la pintura (12 m²)
         * Hauràs de demanar a l'usuari/ària:
         * - L'alt i ample de la paret (multiplicant sabràs l'àrea de la mateixa)
         * - El nombre de mans a aplicar.
         * Mostra en pantalla els litres de pintura a utilitzar.
         */

        final int coberturaLitro = 12;
        int length, height, area, hand;
        double ink;

        Scanner in = new Scanner(System.in);

            System.out.println("To know the quantity of ink to paint your wall, type:\n");
            System.out.println("The length: ");
            length = in.nextInt();
            System.out.println("The height: ");
            height = in.nextInt();
            System.out.println("Quantity of hands: ");
            hand = in.nextInt();

            area = length * height;
            ink = ((double) area / coberturaLitro) * hand;

            System.out.printf("You'll need %.2f liters of ink.\n", ink);
        in.close();
    }
}
