import java.util.Scanner;

public class ex01EXTRAEN {
    public static void main(String[] args) throws Exception {
        
        /*Escriu un programa Java que llegeix un nombre enter per teclat i obté i mostra per pantalla el doble i el triple d'aquest número. */

        int number, doubleNumber, tripleNumber;

        Scanner in = new Scanner(System.in);

            System.out.println("Type a number: ");
            number = in.nextInt();

            doubleNumber = number * 2;
            tripleNumber = number * 3;

            System.out.printf("The double and triple of the number %d is: %d e %d.\n", number, doubleNumber, tripleNumber );

        in.close();
    }
}
