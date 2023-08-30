import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numberA = askInt("Type the first number: ");
        int numberB = askInt("Type the second number: ");
        String multiple = multiple(numberA, numberB);
        System.out.println(multiple);
    }



    static int askInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }
    static String multiple(int a, int b) {
        if (a % b == 0) {
            return "Is multiple.";
        } else {
            return "Isn't multiple.";
        }
    }
}
