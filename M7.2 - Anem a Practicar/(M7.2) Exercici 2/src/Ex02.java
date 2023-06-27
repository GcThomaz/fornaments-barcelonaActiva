import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {

        int number = askNumber("Type a number");
        reversePyramid(number);


    }

    static void reversePyramid(int number) {
        for (int i = number; i >= 1; i--) {
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
