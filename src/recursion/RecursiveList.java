package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        doubleList(list);
        System.out.print(list);
    }

    // double the elements in a list
    private static void doubleList(List<Integer> list) {
        doubleList(list, 0);

    }

    // overload
    private static void doubleList(List<Integer> list, int index) {
        if (index == list.size()) {
            return;
        }

        list.set(index, list.get(index) * 2);
        doubleList(list, index + 1);

    }
}
