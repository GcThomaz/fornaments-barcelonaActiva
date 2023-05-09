import java.util.Scanner;

public class ex02CA {
    public static void main(String[] args) {
        /*Fer un programa que li demani dos números sencers a l’usuari/ària. Al final, el programa imprimeix per pantalla el següent missatge:  
El resultat de la suma és: “valor”
El resultat de la resta és: “valor”
El resultat de la multiplicació és: “valor”
El resultat de la divisió és: “valor”. */

        int numero1, numero2, suma, producte;
        float resta, divisio;

        Scanner in = new Scanner(System.in);

            System.out.println("Escriu el primer numero: ");
            numero1 = in.nextInt();
            System.out.println("Escriu el segon numero: ");
            numero2 = in.nextInt();

            suma = numero1 + numero2;
            resta = numero1 % numero2;
            producte = numero1 * numero2;
            divisio = numero1 / numero2;

            System.out.println("El resultat de la suma és: " + suma + ".");
            System.out.println("El resultat de la resta és: " + resta + ".");
            System.out.println("El resultat de la multiplicació és: " + producte +".");
            System.out.println("El resultat de la divisió és: " + divisio + ".");

        in.close();
    }
}
