import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Un/a professor/a vol calcular les mitges de les notes de tota la classe. Crea una aplicació on l'usuari/ària introduirà un número per pantalla (el número correspon al nombre de notes que vol introduir) i el programa li demanarà que introdueixi les notes de tots els/les alumnes.

Un cop les notes han sigut introduïdes, el programa retorna el següent:

Si la nota mitjana és menor que 5: "La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més".

Si la nota és inferior a 7: "La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal".

Per la resta de casos, el missatge ha de ser: "Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat". */

    Scanner in = new Scanner(System.in);
    ArrayList<Float> gradesList = new ArrayList<Float>();    
    float grade;
    byte quantity;

    System.out.println("How many grades you'll enter?");
    quantity = in.nextByte();

    for (int i = 0; i < quantity; i++) {
        System.out.println("Type your grade: ");
        grade = in.nextFloat();
    }

    
    in.close();
    }
}
