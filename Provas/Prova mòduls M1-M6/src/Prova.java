import java.util.ArrayList;

public class Prova {

    public static void main(String[] args) throws Exception {

        /************************************
         * [METHOD A]
         ************************************/

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        final int times = 10;

        for (int i = 0; i < times; i++) {
            numbers.add((int) (Math.random() * 20));
        }

        int indexSmallestNumber = MethodsProva.biggerSmallerIndex(numbers);
        System.out.printf("The index of the smallest number is: %d.\n", indexSmallestNumber);

        /************************************
         * [METHOD B]
         ************************************/

        ArrayList<String> names = new ArrayList<String>();
        names.add("Arthur");
        names.add("Eliane");
        names.add("Gustavo");
        names.add("Lud");
        names.add("Marcos");
        names.add("Pedro");

        int indexBiggestName = MethodsProva.indexAndBiggestname(names);
        String biggestName = names.get(indexBiggestName);
        System.out.printf("The biggest name is: %s and the index is: %d.\n", biggestName, biggestName, indexBiggestName);
    }

        /************************************
         * [METHOD C]
         ************************************/
}
