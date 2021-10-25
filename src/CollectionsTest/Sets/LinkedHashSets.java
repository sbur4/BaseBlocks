package CollectionsTest.Sets;

import java.util.LinkedHashSet;

/**
 * Java LinkedHashSet class contains unique elements only like HashSet.
 * Java LinkedHashSet class provides all optional set operation and permits null elements.
 * Java LinkedHashSet class is non synchronized.
 * Java LinkedHashSet class maintains insertion order.
 */

// LinkedHashSet будет хранить элементы в порядке добавления, но зато работает медленнее.

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> myNums = new LinkedHashSet<>();
        myNums.add(7);
        myNums.add(1);
        myNums.add(5);
        myNums.add(3);
        myNums.add(null);
        System.out.println(myNums);
        System.out.println(myNums.contains(5));
        System.out.println(myNums.size());
        System.out.println("\n");
    }
}
