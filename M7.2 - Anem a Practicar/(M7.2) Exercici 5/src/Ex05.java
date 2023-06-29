import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        int number = askint("Type a number: ");
        System.out.println(prim(number));
    }

    static boolean prim(int num){
        boolean x = false;
        if (num % num == 0) {
            x = true;
        }
        return x;
    }

    static int askint(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        //in.close();
        return in.nextInt();
    }
}
