import java.util.Scanner;

public class App {
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
            Methods.showMenu();
            option = in.nextByte();

            switch (option) {
                case 0:
                    System.out.println("Program terminated.");
                    break;
                case 1:
                    Methods.calculateSquareArea(in);
                    break;
                case 2:
                    Methods.calculateTriangleArea(in);
                    break;
                case 3:
                    Methods.calculateRectangleArea(in);
                    break;
                case 4:
                    Methods.calculateCircleArea(in);
                    break;

                default:
                    System.out.println("Invalid Number!");
                    break;
            }

        } while (option != 0);

        in.close();
    }
}
