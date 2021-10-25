package CollectionsTest.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Java Deque Interface is a linear collection that supports element insertion and removal at both ends.
 * Deque is an acronym for "double ended queue".
 */

public class DequeAndArrayDeque {
    public static void main(String[] args) {
        Deque<String> dList = new ArrayDeque<>();
        dList.add("Police");
        dList.add("Politi");
        dList.add("Polici");
//        dList.add(null);
        System.out.println(dList);
        System.out.println(dList.size());
        System.out.println(dList.peek());// without del
        System.out.println(dList.poll());// with del
        System.out.println(dList);
        System.out.println(dList.size());
        System.out.println(dList.add("Polici"));
        System.out.println(dList);

    }
}
