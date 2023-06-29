import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {

        int year = askInt("Type a year: ");

        if (bissexto(year)) {
            System.out.println(year + " é um ano bissexto.");
        } else {
            System.out.println(year + " não é um ano bissexto.");
        }
    }

    public static boolean bissexto(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    static int askInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }
}
