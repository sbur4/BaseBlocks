package CollectionsTest.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ArrayList internally uses a dynamic array to store the elements.
 * Manipulation with ArrayList is slow because it internally uses an array.
 * If any element is removed from the array, all the bits are shifted in memory.
 * An ArrayList class can act as a list only because it implements List only.
 * ArrayList is better for storing and accessing data.
 * <p>
 * Java ArrayList class can contain duplicate elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList class is non synchronized.
 * Java ArrayList allows random access because array works at the index basis.
 * In ArrayList, manipulation is little bit slower than the LinkedList in Java because a
 * lot of shifting needs to occur if any element is removed from the array list.
 */

//ArrayList лучше использовать, если Вам главное иметь быстрый доступ к элементам списка.

public class ArrayLists {

    public static void main(String[] args) {
        List<String> beer = new ArrayList<String>();
        beer.add("Estrella Damm Spain");
        beer.add("Hoegaarden Belgian");
        beer.add("Dzenyk Ukraine");
        beer.add("BUDwaiser USA");
        System.out.println(beer + "\n");
        System.out.println(beer.size() + "\n");
        System.out.println(beer.get(0) + "\n");
        beer.add("BUDwaiser USA");
//        beer.add(null);
        System.out.println(beer);

        /*
         * beer.clear(); System.out.println(beer + "\n");
         */

        for (String i : beer) {
            System.out.println(i);
        }

        System.out.println("\n");

        Collections.sort(beer); // Sort cars
        for (String i : beer) {
            System.out.println(i);
        }

    }
}