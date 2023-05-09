import java.util.Scanner;

public class ex01CA {
    public static void main(String[] args) {
        
        String nom, cognom;
        int edad;

        Scanner in = new Scanner (System.in);

            System.out.println("Escriu el teu nom: ");
            nom = in.nextLine();
            System.out.println("Escriu el teu cognom: ");
            cognom = in.nextLine();
            System.out.println("Escriu la teva edad: ");
            edad = in.nextInt();

            System.out.println("Et dius: " + nom + " " + cognom + " i tens " + edad + " anys.");
        in.close();
    }
}
