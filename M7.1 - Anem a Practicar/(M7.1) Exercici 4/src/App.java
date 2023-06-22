import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int number1, number2;

        System.out.println("Type the first number: ");
        number1 = in.nextInt();
        System.out.println("Type the second number: ");
        number2 = in.nextInt();

        System.out.println(negative(number1, number2));
        in.close();
    }

    static String negative(int number, int number2) {
        String answer;

        if (number < 0) {
            answer = "First number is negative!";
        } else if(number2 < 0) {
            answer = "Second number is negative!";
        } else {
            answer = "No negative numbers";
        }

        return answer;
    }
}
