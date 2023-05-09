import java.util.Scanner;

public class ex01EN {
    public static void main(String[] args) throws Exception {
        
        /*Fer un programa que li demani a l’usuari/ària: El nom, el cognom i l’edat. Un cop l’usuari/ària hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla.*/

        String name, lastName; // Variable declaration.
        int age;// Variable declaration.

        Scanner in = new Scanner (System.in); // Insert Scanner method to interact with the user.

            System.out.println("Type your name: "); // Ask the user's name.
            name = in.nextLine(); // Read the variable name [save the answer of the user(name)].
            System.out.println("Type your last name: "); // Ask the user's last name.
            lastName = in.nextLine(); // Read the variable lastName [save the answer of the user(last name)].
            System.out.println("Type your age: "); // Ask the user's age.
            age = in.nextInt(); // Read the variable age [save the answer of the user(age)].

            System.out.println("Your name is: " + name + " " + lastName + ". You're " + age + " years old."); // Print the data of user's input.
        in.close(); // Finish the Scanner method.
    }
}
