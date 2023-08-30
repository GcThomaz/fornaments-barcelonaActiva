import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {

        int number = askNumber("Type a number: ");
        pyramid(number);

    }

    static void pyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int askNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }
}
