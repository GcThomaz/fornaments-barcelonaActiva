import java.util.ArrayList;

public class MethodsProva {

    // Method A: arrayList de números com a paràmetre

    public static int biggerAndSmaller(ArrayList<Integer>numbers) {

        int bigger = 0;
        int smaller = 20;
        int index = 0;
        
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
        System.out.printf("The biggest and smallest numbers of the list, respectively, are: %d and %d.\n", bigger, smaller);

        return index;
    }
}
