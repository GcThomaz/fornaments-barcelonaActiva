import java.util.Scanner;

public class Methods02 {

    public static int askHowManyAges(int quantity) {
        Scanner in = new Scanner(System.in);

            System.out.println("How many ages you'll introduce: ");
            quantity = in.nextByte();

        in.close();
        return quantity;
    }

    public static double askUserAges(double quantity) {

        Scanner in = new Scanner(System.in);
        int ages;
        int sumAges = 0;
        double average;

        for (int i = 0; i <= quantity; i++) {

            System.out.println("Type the age: ");
            ages = in.nextInt();

            while (ages < 0 || ages > 120) {
                System.out.println("Invalid number. Try again!");
                System.out.println("Type the age: ");
                ages = in.nextInt();
            }
            sumAges += ages;
        }
        average = sumAges / quantity;   
        in.close();

        return average;
    }
}
