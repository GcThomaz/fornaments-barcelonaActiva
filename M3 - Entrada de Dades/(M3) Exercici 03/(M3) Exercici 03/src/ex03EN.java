import java.util.Scanner;


public class ex03EN {
    public static void main(String[] args) throws Exception {
        
        
        /*El programa demana a l'usuari/ària que introdueixi 3 notes i el programa mostra la mitja de les 3 notes per pantalla. */
        
            int grade1, grade2, grade3;
            float average;

            Scanner in = new Scanner(System.in);

                System.out.println("Type the first grade: ");
                grade1 = in.nextInt();
                System.out.println("Type the second grade: ");
                grade2 = in.nextInt();
                System.out.println("Type the third grade: ");
                grade3 = in.nextInt();

                average = ( grade1 + grade2 + grade3) / 3;

                System.out.println("The average of your 3 grades are: " + average + ".");

            in.close();
    }
}
