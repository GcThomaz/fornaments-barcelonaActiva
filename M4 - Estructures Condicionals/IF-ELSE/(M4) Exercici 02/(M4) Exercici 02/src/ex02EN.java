import java.util.Scanner;

public class ex02EN {
    public static void main(String[] args) throws Exception {
        /*Aquest programa li demana l’edat a l’usuari/ària, en funció d’aquesta, mostrarem un dels següents missatges per pantalla:
Si té 5 anys o menys: preescolar.
Si té entre 6 i 11 anys: primària.
Si té entre 12 i 15: ESO.
Si té entre 16 i 17: Batxillerat.
Si és major d'edat: FP o Universitat. */

        int age;

        Scanner in = new Scanner(System.in);

            System.out.println("Type your age: ");
            age = in.nextInt();

                if (age <= 5) {
                    System.out.println("Preschool");
                } else if (age >= 6 && age <= 11) {
                    System.out.println("Primary School.");
                } else if (age >=12 && age <= 15) {
                    System.out.println("School.");
                } else if (age >= 16 && age <= 17) {
                    System.out.println("High School.");
                } else if (age >= 18) {
                    System.out.println("University.");
                }
        in.close();

    }
    }
