import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {

    }

    static String askString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        //in.close();
        return in.nextLine();
    }

    static int askNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        //in.close();
        return in.nextInt();
    }
}
