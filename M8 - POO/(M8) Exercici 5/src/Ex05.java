import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int posicionX;
        int posicionY;
        int radius;        

        posicionX = askNumber("The X coordinate is: ");

        posicionY = askNumber("The Y coordinate is: ");

        radius = askNumber("The radius would be: ");

        Point center = new Point(posicionX, posicionY);
        Circle circle = new Circle(center, radius);

        posicionX = askNumber("The X coordinate is: ");

        posicionY = askNumber("The Y coordinate is: ");

        radius = askNumber("The radius would be: ");

        Point center2 = new Point(posicionX, posicionY);
        Circle circle2 = new Circle(center2, radius);

        System.out.println("Distance between the two circles:" + circle.distanceCenter(circle2));
        System.out.println(circle.equals(circle2));
        System.out.println(circle.cocentricos(circle2));
        System.out.println(circle.equalRadius(circle2));
        System.out.println(circle.tangents(circle2));
        System.out.println(circle.secant(circle2));
        System.out.println(circle.dontTouch(circle2));
    }

    static int askNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }
}
