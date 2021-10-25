package CollectionsTest.Lists;

import java.util.List;
import java.util.Stack;

/**
 * The stack is a linear data structure that is used to store the collection of objects.
 * It is based on Last-In-First-Out (LIFO)
 **/

public class Stacks {
    public static void main(String[] args) {
        List<Integer> vecList = new Stack<>();
        vecList.add(1);
        System.out.println(vecList);
        vecList.add(0, 2);
        System.out.println(vecList);
    }
}
