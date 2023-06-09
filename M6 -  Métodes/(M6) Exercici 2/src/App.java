import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int quantity = askInt("How many people do you want to calculate the average?");
        double average = average(quantity);
        System.out.println("The average is: " + average + " years old.");
    }

    static int askInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }

    static double average(int quantity) {
        int age;
        double averageAge;
        int sum = 0;

        for (int i = 0; i < quantity; i++) {

            Scanner in = new Scanner(System.in);
            System.out.print("Type the age: ");
            age = in.nextInt();

            if (age > 0 && age <= 120) {
                sum += age;
            } else {
                i--;
            }

        }
        averageAge = sum / quantity;

        return averageAge;
    }
}
