import java.util.ArrayList;
import java.util.Collections;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(reverse(list));
    }

    static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reverse = new ArrayList<Integer>(list);
        Collections.reverse(reverse);
        return reverse;
    }
}