import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Crea una llista de tasques. Fes un menú que permeti a l’usuari/ària afegir,
         * mostrar i eliminar tasques, a més de sortir de l’aplicació.
         */
        ArrayList<String> tasksList = new ArrayList<String>();
        menu(tasksList);
    }

    static void menu(ArrayList<String> tasksList) {
        Scanner in = new Scanner(System.in);
        byte option = -1;

        while (option != 0) {
            System.out.println("***** MENU *****");
            System.out.println("1. Add task");
            System.out.println("2. Show task");
            System.out.println("3. Remove task");
            System.out.println("0. Exit Menu");

            option = in.nextByte();

            switch (option) {
                case 1:
                    String createTask = askString("Type the name of the task: ");
                    createTask(tasksList, createTask);
                    break;
                case 2:
                    String seeName = askString("Type the name of the task: ");
                    seeTask(tasksList, seeName);
                    break;
                case 3:
                    String deleteName = askString("Type the name of the task: ");
                    removeTask(tasksList, deleteName);
                    break;
                case 0:
                    System.out.println("Bye!!!");
                    break;

                default:
                    System.out.println("Invalid Option! Try again.");
                    break;
            }
           // in.close();
        }
    }

    static void createTask(ArrayList<String> tasksList, String name) {
        tasksList.add(name);
        System.out.println("Task created susscessfully!");
    }

    static void seeTask(ArrayList<String> tasksList, String name) {
        tasksList.indexOf(name);
        System.out.println(name);
    }

    static void removeTask(ArrayList<String> tasksList, String name) {
        int index = tasksList.indexOf(name);
        tasksList.remove(index);
        System.out.println("Task removed susscessfully!");

    }

    static String askString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close;
        return in.nextLine();
    }
}
