import java.util.ArrayList;

public class MethodsProva {

    /****************************************************************************************************
     * [METHOD A]
     ****************************************************************************************************/

    public static byte biggerSmallerIndex(ArrayList<Byte> numbers) {

        // Declaration and assignment of variables
        int bigger = numbers.get(0);
        int smaller = numbers.get(0);
        int index = 0;

        /*
         * Loop (for) with a condition (if) to get the biggest and the smallest number
         * of the ArrayList<Integer> numbers.
         * While my counter i is smaller than the size of ArrayList<Integer> numbers it
         * will compare the sizes of the numbers and store the biggest and smallest into
         * the bigger and smaller variables.
         */

        System.out.println("\nThe random list of numbers is: ");//Print the ArrayList
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {//It'll go through the size of the list and check which is the biggest and smallest number
            if (bigger < numbers.get(i)) {
                bigger = numbers.get(i);
            }
            if (smaller > numbers.get(i)) {
                smaller = numbers.get(i);
                index = i;
            }
        }

        System.out.printf("The biggest and smallest numbers of the list, respectively, are: %d and %d.\n", bigger,
                smaller);//Print the biggest and smallest numbers of the ArrayList<Integer> numbers.

        return (byte) index;//Return the index that contain the smallest number os the ArrayList<Integer> numbers
    }

    /****************************************************************************************************
     * [METHOD B]
     ****************************************************************************************************/

    public static int indexAndBiggestname(ArrayList<String> names) {

        // Declaration and assignment of variables
        String name;
        int nameSize;
        int biggestNameSize = 0;
        int index = 0;

        System.out.println("\nThe list of names is: ");//Print the ArrayList (Each element in a diferent line)
        for (String listName : names) {
            System.out.println(listName);
        }

        for (int i = 0; i < names.size(); i++) {
            name = names.get(i);
            nameSize = name.length();

            if (nameSize > biggestNameSize) {
                biggestNameSize = nameSize;
                index = i;
            }
        }
        return index;//Return the index of the biggest name
    }

    /****************************************************************************************************
     * [METHOD C]
     ****************************************************************************************************/

    public static ArrayList<Integer> betwheenTwoNumbers(int number1, int number2) {

        //Create the ArrayList and define a type and a name
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();

        for (int i = number1 + 1; i < number2; i++) {
            allNumbers.add(i);
        }
        return allNumbers;//Return the ArrayList of the numbers betwheen number1 and number2
    }

    /****************************************************************************************************
     * [METHOD D]
     ****************************************************************************************************/

    public static int indexOfChars(ArrayList<Character> letters, char search) {

        //Declarate and assign the variables
        char letter = Character.toUpperCase(search);
        int index = -1;

        System.out.printf("\nThe characters of the list are:\n");//Print the ArrayList
        System.out.println(letters);

        for (int i = 0; i < letters.size(); i++) {
            if (letter == letters.get(i)) {
                index = i;
                break;
            }
        }
        return index;//Return the index of the especified character
    }
}
