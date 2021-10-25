package CollectionsTest.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        /*
         * Java HashMap contains values based on the key.
         * Java HashMap contains only unique keys.
         * Java HashMap may have one null key and multiple null values.
         * Java HashMap is non synchronized.
         * Java HashMap maintains no order.
         * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
         */
        // хранит значения в произвольном порядке, но позволяет быстро искать элементы карты
        Map<Integer, String> digits = new HashMap();
        digits.put(3, "Java8");
        digits.put(2, null);
        digits.put(1, "Java16");
        digits.put(5, "Java11");
        digits.put(null, null);
        digits.put(7, "Java9");
        digits.put(9, "Java15");
        digits.put(10, null);
        digits.put(11, "abc");
        digits.put(12, "abc");
        digits.put(13, "abc");
        digits.put(14, "abc");
        digits.put(15, "abc");
        digits.put(15, "abc");
        digits.put(16, "abc");
        digits.put(17, "abc");
        digits.put(18, "abc");
        digits.put(19, "abc");
        digits.put(20, "abc");
//        System.out.println(digits);
        System.out.println(digits.size());
        System.out.println(digits.entrySet());
        System.out.println(digits.remove(10));
    }
}
