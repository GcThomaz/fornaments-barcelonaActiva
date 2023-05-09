import java.util.Scanner;

public class ex05EN {
    public static void main(String[] args) {

        /*Fer un programa que demani dos números i un operador(+,-,*,/).
         * Al final, el programa ha d'imprimir per pantalla el resultat de fer
         * l’operació que contingui la variable operador.*/

        char operador;
        int numA, numB, sum, subtraction, multiplication;
        float division;

        Scanner in = new Scanner(System.in);

        System.out.println("Type an operator: (+, -, *, /)");
        operador = in.next().charAt(0);
        System.out.println("Type the first number: ");
        numA = in.nextInt();
        System.out.println("Type the second number: ");
        numB = in.nextInt();

        switch (operador) {
            case '+':
                sum = numA + numB;
                System.out.println("The sum is: " + sum);
                break;
            case '-':
                subtraction = numA - numB;
                System.out.println("The subtraction is: " + subtraction);
                break;
            case '*':
                multiplication = numA * numB;
                System.out.println("The multiplication is: " + multiplication);
                break;
            case '/':
                division = numA / (float) numB;
                System.out.println("The division is: " + division);
                break;
        }
        in.close();
    }
}