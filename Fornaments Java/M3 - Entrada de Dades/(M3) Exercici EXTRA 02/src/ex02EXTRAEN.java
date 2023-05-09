import java.util.Scanner;

public class ex02EXTRAEN {
    public static void main(String[] args) throws Exception {
        /*Escriu un programa Java que sol·liciti per pantalla un nombre enter, i si és menor que 10, ho assigni a una variable de tipus int, anomenada varInt. Si no ho és, llavors li assignarà a la variable varInt el número 1. (Utilitza per a això l'operador condicional ? :) Després, imprimeix la taula de multiplicar d'aquesta variable. */

        int number, varInt;

        Scanner in = new Scanner(System.in);

        System.out.println("Type a number: ");
        number = in.nextInt();

        varInt = (number < 10) ? number : 1; // The VARINT variable will receive the NUMBER variable if the number stored in the NUMBER variable is less than 10. If this logical comparison is false, the program will store the integer 1 in the VARINT variable.

        System.out.println(varInt + "\n");

        System.out.println("1 X " + number + " = " + number * 1);
        System.out.println("2 X " + number + " = " + number * 2);
        System.out.println("3 X " + number + " = " + number * 3);
        System.out.println("4 X " + number + " = " + number * 4);
        System.out.println("5 X " + number + " = " + number * 5);
        System.out.println("6 X " + number + " = " + number * 6);
        System.out.println("7 X " + number + " = " + number * 7);
        System.out.println("8 X " + number + " = " + number * 8);
        System.out.println("9 X " + number + " = " + number * 9);
        System.out.println("10 X " + number + " = " + number * 10);

        in.close();
    }
}
