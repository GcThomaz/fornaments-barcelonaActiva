import java.util.Scanner;

public class Methods01 {


// Method to show the Menu options
    public static void showMenu() {
        System.out.println("\nMenu: ");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Circle");
        System.out.println("0. Out");
        System.out.print("Choose an option: ");
    }

//Method to calculate the area of a SQUARE

    public static void calculateSquareArea(Scanner in) {
        System.out.println("Enter the value of the Square's side:");
        double side = in.nextDouble();
        double squareArea = side * side;
        
        System.out.printf("The square's area is: %.2f .\n", squareArea);
    }

//Method to calculate the area of a TRIANGLE

    public static void calculateTriangleArea(Scanner in) {
        System.out.println("Enter the value of base:");
        double base = in.nextDouble();
        System.out.println("Enter the value of height: ");
        double height = in.nextDouble();

        double rectangleArea = base * height / 2;

        System.out.printf("The triangle's area is: %.2f .\n", rectangleArea);
    }

//Method to calculate the area of a RECTANGLE

    public static void calculateRectangleArea(Scanner in) {
        System.out.println("Enter the value of base:");
        double base = in.nextDouble();
        System.out.println("Enter the value of height: ");
        double height = in.nextDouble();

        double rectangleArea = base * height;

        System.out.printf("The rectangle's area is: %.2f .\n", rectangleArea);
    }

//Method to calculate the area of a CIRCLE

    public static void calculateCircleArea(Scanner in) {
        System.out.println("Enter the value of the circle radius: ");
        double radius = in.nextFloat();

        double circleArea = Math.PI * radius * radius;

        System.out.printf("The circle's area is: %.2f .\n", circleArea);
    }
}
