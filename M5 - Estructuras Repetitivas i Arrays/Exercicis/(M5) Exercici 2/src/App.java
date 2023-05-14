import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* El programa demana dos números enters i llavors calcula la suma dels valors compresos entre els dos números, inclosos. 
Exemple: 4 i 10  --> resultat = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49 */

        Scanner in = new Scanner(System.in);
            System.out.println("Escriu el primer numero: ");
            int numero1 = in.nextInt();
            System.out.println("Escriu el segon numero: ");
            int numero2 = in.nextInt();

            int suma = 0;
            int numeroAux;

            if (numero2<numero1) {
                numeroAux=numero1;
                numero1=numero2;
                numero2=numeroAux;
            }
            for (int i = numero1; i <= numero2; i++) {
                suma += i;
            }
            System.out.println("La suma dels valors compresos entre " + numero1 + " i " + numero2 + " és: " + suma + ".");
        in.close();
    }
}
