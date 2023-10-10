import java.util.ArrayList;
import java.util.HashSet;

public class Exercise19_03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);

        ArrayList<Integer> newList = removeDuplicates(list);

        System.out.print(newList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> uniqueElements = new HashSet<>();
        ArrayList<E> result = new ArrayList<>();

        for (E element : list) {
            if (uniqueElements.add(element)) {
                result.add(element);
            }
        }

        return result;
    }
}