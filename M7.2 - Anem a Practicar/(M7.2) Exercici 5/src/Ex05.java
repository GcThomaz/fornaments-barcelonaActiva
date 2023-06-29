import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        int number = askint("Type a number: ");
        System.out.println(prim(number));
    }

    static boolean prim(int num){

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
        //in.close();
        return in.nextInt();
    }
}
