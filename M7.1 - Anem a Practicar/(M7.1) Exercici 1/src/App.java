import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crea un programa on l’usuari/ària introdueix tres notes i el programa calcula
         * la mitja.
         * 
         * Si la mitja és inferior a 5 ha de mostrar el següent missatge per pantalla:
         * “No has superat el curs. Has de recuperar”.
         * 
         * Si la mitja està entre 5 i 7 ha de mostrar: “Enhorabona! Has aprovat, però
         * hauries de continuar practicant”.
         * 
         * Si la mitja és superior a 7 ha de mostrar:
         * "Enhorabona! Has superat el curs! Passa ja al següent nivell!"
         */

        float firstGrade, secondGrade, thirdGrade; //Declaration of variables

        Scanner in = new Scanner(System.in); //Method Scanner to get user's information

        System.out.println("To know your final grade, type your grades!");

        System.out.println("Type the first grade:");
        firstGrade = in.nextInt();

        System.out.println("Type your second grade:");
        secondGrade = in.nextInt();

        System.out.println("Type your third grade:");
        thirdGrade = in.nextInt();

        in.close();

        //Comparation to know if the result of the average is lower, equal or higher than 5.

        if (Operation.average(firstGrade, thirdGrade, secondGrade) < 5) {
            System.out.println("Mitja: " + Operation.average(firstGrade, thirdGrade, secondGrade)
                    + ". No has superat el curs. Has de recuperar.");
        } else if (Operation.average(firstGrade, thirdGrade, secondGrade) < 7) {
            System.out.println("Mitja: " + Operation.average(firstGrade, thirdGrade, secondGrade)
                    + ". Enhorabona! Has aprovat, però hauries de continuar practicant");
        } else {
            System.out.println("Mitja: " + Operation.average(firstGrade, thirdGrade, secondGrade)
                    + ". Enhorabona! Has superat el curs! Passa ja al següent nivell!");
        }
    }
}
