import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        /*
         * Realitzar un programa que tingui un menú on se li mostraran 4 opcions a
         * l’usuari/ària per pantalla:
         * 
         * 1.- Quadrat
         * 
         * 2.- Triangle
         * 
         * 3.- Rectangle
         * 
         * 4.- Cercle
         * 
         * 0.- Sortir del programa
         * 
         * Segons l’opció escollida haurà d’introduir unes dades o altres perquè el
         * programa mostri per pantalla l’àrea (el valor) del polígon escollit.
         */

        Scanner in = new Scanner(System.in);
        byte option;

        do {
            Methods03.showMenu();
            option = in.nextByte();

            switch (option) {
                case 0:
                    System.out.println("Program terminated.");
                    break;
                case 1:
                    Methods03.calculateSquareArea(in);
                    break;
                case 2:
                    Methods03.calculateTriangleArea(in);
                    break;
                case 3:
                    Methods03.calculateRectangleArea(in);
                    break;
                case 4:
                    Methods03.calculateCircleArea(in);
                    break;

                default:
                    System.out.println("Invalid Number!\n");
                    break;
            }

        } while (option != 0);

        in.close();
    }
}
