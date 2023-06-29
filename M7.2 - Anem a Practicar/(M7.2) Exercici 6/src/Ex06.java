import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        int num;
        do {
            int number = askint("Type a number: ");
            num = number;

            if (prim(number)) {
                System.out.println(number + " é um número primo.");
            } else {
                System.out.println(number + " não é um número primo. Tente novamente.");
            }
        } while (!prim(num));
    }

    static boolean prim(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int askint(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }
}
