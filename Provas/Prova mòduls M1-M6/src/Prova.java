import java.util.ArrayList;

public class Prova {
    public static void main(String[] args) throws Exception {

        //(Method A) Create a list with 10 aleatory numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        final int times = 10;

        for (int i = 0; i < times; i++) {
            numbers.add((int) (Math.random() * 20));
        }

        // Call Method A
        int index = MethodsProva.biggerAndSmaller(numbers);
        System.out.printf("The index of the smallest number is: %d.\n", index);
    }
}
