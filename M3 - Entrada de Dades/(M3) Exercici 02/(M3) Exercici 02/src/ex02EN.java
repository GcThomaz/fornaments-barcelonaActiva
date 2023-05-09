import java.util.Scanner;

public class ex02EN {
    public static void main(String[] args) throws Exception {
        /*Fer un programa que li demani dos números sencers a l’usuari/ària. Al final, el programa imprimeix per pantalla el següent missatge:  
El resultat de la suma és: “valor”
El resultat de la resta és: “valor”
El resultat de la multiplicació és: “valor”
El resultat de la divisió és: “valor”. */

        int number1, number2, sum, product;
        float rest, division;

        Scanner in = new Scanner(System.in);

            System.out.println("Type the first number: ");
            number1 = in.nextInt();
            System.out.println("Type the second number: ");
            number2 = in.nextInt();

            sum = number1 + number2;
            rest = number1 % number2;
            product = number1 * number2;
            division = number1 / number2;

            System.out.println("The result of the sum between " + number1 + " and " + number2 + " is " + sum + ".");
            System.out.println("The result of the rest betwheen " + number1 + " and " + number2 + " is " + rest + ".");
            System.out.println("The result of the product betwheen " + number1 + " and " + number2 + " is " + product + ".");
            System.out.println("The result of the division betwheen " + number1 + " and " + number2 + " is " + division + ".");

        in.close();


    }
}
