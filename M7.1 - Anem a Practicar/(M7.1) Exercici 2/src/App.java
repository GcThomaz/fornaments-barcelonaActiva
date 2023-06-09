import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int quantity = askInt("Type the number of the quantity of the studants: ");
        String result = average(quantity);
        System.out.println(result);
    }

    static int askInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);

        return in.nextInt();
    }

    static String average(int quantity) {
        double grade;
        double sum = 0;
        double average;

        for (int i = 0; i < quantity; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Type the grade: ");
            grade = in.nextInt();
            sum += grade;
        }
        average = sum / quantity;

        if (average < 5) {
            return "Class Average: " + average + " .The average grade of the class is suspended. The students should ask their doubts and work harder.";

        } else if (average < 7) {
            return "Class Average: " + average + " .The average grade of the class is good, but the students should improve their personal work.";
        } else {
            return "Class Average: " + average + " .Congratulations! The average grade of the class corresponds to the effort made.";
        }
    }
}