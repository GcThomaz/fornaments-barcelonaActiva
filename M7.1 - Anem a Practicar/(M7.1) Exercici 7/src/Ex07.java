import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Type a character: ");
        char x = in.next().charAt(0);

        System.out.print("Type a number: ");
        int number = in.nextInt();

        square(number, x);

        in.close();

    }

    static void square(int number, char x) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
