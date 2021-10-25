package CollectionsTest.Maps;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashTables {
    public static void main(String[] args) {
/**
 * A Hashtable is an array of a list. Each list is known as a bucket.
 * The position of the bucket is identified by calling the hashcode() method.
 * A Hashtable contains values based on the key.
 * Java Hashtable class contains unique elements.
 * Java Hashtable class doesn't allow null key or value.
 * Java Hashtable class is synchronized.
 * The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
 */

//Hashtable - как HashMap, только не позволяет хранить null и синхронизирован с точки зрения многопоточности
// - это значит, что много потоков могут работать безопасно с Hashtable. Но данная реализация старая и медленная,
// поэтому сейчас уже не используется в новых проектах.
        Map<Integer, String> digits = new Hashtable<>();
        digits.put(3, "Java8");
//        digits.put(2, null);
        digits.put(1, "Java16");
        digits.put(5, "Java11");
//        digits.put(null, null);
        digits.put(7, "Java9");
        digits.put(9, "Java15");
        digits.put(11, "abc");
        digits.put(12, "abc");
//        System.out.println(digits);
        System.out.println(digits.size());
        System.out.println(digits.entrySet());
        System.out.println(digits.remove(11));

        //хранит значения в порядке добавления.
        Map<Integer, String> data = new LinkedHashMap<>();
        data.put(1, "abc");
        data.put(2, "abc");
        data.put(null, null);
        data.put(3, null);
        System.out.println(data.entrySet());
    }
}
