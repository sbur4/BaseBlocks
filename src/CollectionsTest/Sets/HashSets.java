package CollectionsTest.Sets;

import java.util.HashSet;

/**
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * HashSet allows null value.
 * HashSet class is non synchronized.
 * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
 * HashSet is the best approach for search operations.
 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
 */

//HashSet хранит элементы в произвольном порядке, но зато быстро ищет. Подходит, если порядок Вам не важен,
// но важна скорость. Более того, для оптимизации поиска, HashSet будет хранить элементы так, как ему удобно.

public class HashSets {
    public static void main(String[] args) {

        HashSet<Integer> myNums = new HashSet<Integer>();
        myNums.add(7);
        myNums.add(1);
        myNums.add(5);
        myNums.add(3);
        myNums.add(null);
        System.out.println(myNums);
    }
}
