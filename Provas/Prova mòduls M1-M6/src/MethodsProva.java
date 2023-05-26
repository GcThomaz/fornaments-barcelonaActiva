import java.util.ArrayList;

public class MethodsProva {

    /************************************
     * [METHOD A]
     ************************************/

    /*
     * [METHOD A: biggerSmallerIndex()] Create a method that receives an arrayList
     * of numbers as a parameter, print the largest number by console and return
     * the index of the arrayList where the smallest number is located.
     */
    public static int biggerSmallerIndex(ArrayList<Integer> numbers) {

        // Declaration and assignment of variables
        int bigger = 0;
        int smaller = 20;
        int index = 0;

        /*
         * Loop (for) with a condition (if) to get the biggest and the smallest number
         * of the ArrayList<Integer> numbers.
         * While my counter i is smaller than the size of ArrayList<Integer> numbers it
         * will compare the sizes of the numbers and store the biggest and smallest into
         * the bigger and smaller variables.
         */

         System.out.println("\nThe random list is: ");
         for (Integer listNumbers : numbers) {
             System.out.println(listNumbers);
         }

        for (int i = 0; i < numbers.size(); i++) {
            if (bigger < numbers.get(i)) {
                bigger = numbers.get(i);
            }
            if (smaller > numbers.get(i)) {
                smaller = numbers.get(i);
                index = i;
            }
        }
        System.out.printf("The biggest and smallest numbers of the list, respectively, are: %d and %d.\n", bigger, smaller); // Print the biggest and smallest numbers of the ArrayList<Integer> numbers.

        return index; // return the index that contain the smallest number os the ArrayList<Integer>
                      // numbers
    }

    /************************************
     * [METHOD B]
     ************************************/

    /*
     * [METHOD B: (indexAndBiggestname()] Crea un mètode que rebi un arrayList de
     * noms com a paràmetre i retorni l’índex del nom més llarg.
     */

    public static int indexAndBiggestname(ArrayList<String> names) {

        String name;
        int nameSize;
        int biggestNameSize = 0;
        Integer index = 0;

        System.out.println("\nThe list of names is: ");
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

        return index;
    }
}
