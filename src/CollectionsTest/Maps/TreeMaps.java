package CollectionsTest.Maps;

import java.util.Map;
import java.util.TreeMap;

/**
 * Java TreeMap contains values based on the key.
 * It implements the NavigableMap interface and extends AbstractMap class.
 * Java TreeMap contains only unique elements.
 * Java TreeMap cannot have a null key but can have multiple null values.
 * Java TreeMap is non synchronized.
 * Java TreeMap maintains ascending order.
 */

public class TreeMaps {
    public static void main(String[] args) {

        // сама сортирует значения по заданному критерию. TreeMap используется либо с Comparable элементами, либо в связке с Comparator.
        Map<Integer, String> itSchool = new TreeMap<>();
        itSchool.put(5, "luxsoft");
//        itSchool.put(null,"skillup");
        itSchool.put(1, "epam");
        itSchool.put(3, "softserve");
        itSchool.put(2, "genesis");
        itSchool.put(4, "cicklum");
        itSchool.put(6, null);
        itSchool.put(7, "cicklum");
        System.out.println(itSchool.entrySet());
    }
}
