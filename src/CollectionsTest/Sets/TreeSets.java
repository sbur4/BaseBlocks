package CollectionsTest.Sets;

import java.util.TreeSet;

/**
 * Java TreeSet class contains unique elements only like HashSet.
 * Java TreeSet class access and retrieval times are quiet fast.
 * Java TreeSet class doesn't allow null element.
 * Java TreeSet class is non synchronized.
 * Java TreeSet class maintains ascending order.
 */

//TreeSet хранит элементы отсортированными.

public class
TreeSets {
    public static void main(String[] args) {
        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("abc");
        strSet.add("def");
        strSet.add("gh");
//        strSet.add(null);
        System.out.println(strSet);
    }
}
