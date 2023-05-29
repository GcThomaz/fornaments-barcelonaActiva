import java.util.ArrayList;

public class Prova {

    public static void main(String[] args) throws Exception {

        /************************************************************************************************
         * [METHOD A]
         ************************************************************************************************/

        ArrayList<Byte> numbers = new ArrayList<Byte>();
        final int times = 10;//Constant of the aleatory numbers that I want inside the ArrayList

        for (int i = 0; i < times; i++) {//Definition of the aleatory numbers
            numbers.add((byte) (Math.random() * 20));
        }

        byte indexSmallestNumber = MethodsProva.biggerSmallerIndex(numbers);
        System.out.printf("The index of the smallest number is: %d.\n", indexSmallestNumber);

        /************************************************************************************************
         * [METHOD B]
         ************************************************************************************************/

        ArrayList<String> names = new ArrayList<String>();
        names.add("Arthur");
        names.add("Eliane");
        names.add("Gustavo");
        names.add("Lud");
        names.add("Marcos");
        names.add("Pedro");

        int indexBiggestName = MethodsProva.indexAndBiggestname(names);
        String biggestName = names.get(indexBiggestName);
        System.out.printf("The biggest name is: %s and the index is: %d.\n", biggestName, indexBiggestName);

        /************************************************************************************************
         * [METHOD C]
         ************************************************************************************************/

        int number1 = 5;
        int number2 = 15;
        ArrayList<Integer> numbersBetwheen = MethodsProva.betwheenTwoNumbers(number1, number2);

        System.out.printf("\nThe numbers betwheen %d and %d are:\n", number1, number2);
        System.out.println(numbersBetwheen);

        /************************************************************************************************
         * [METHOD D]
         ************************************************************************************************/

        ArrayList<Character> letters = new ArrayList<Character>();

        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        letters.add('E');
        letters.add('F');
        letters.add('G');

        char search1 = 'c';
        char search2 = 'j';

        int indexLetter = MethodsProva.indexOfChars(letters, search1);
        System.out.printf("The index of %c is: %d.\n", search1, indexLetter);

        int invalidIndexLetter = MethodsProva.indexOfChars(letters, search2);
        System.out.printf("The index of %c is: %d.\n", search2, invalidIndexLetter);

    }
}
