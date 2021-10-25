package CollectionsTest.Lists;

import java.util.LinkedList;

/**
 * LinkedList internally uses a doubly linked list to store the elements.
 * Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list,
 * so no bit shifting is required in memory.
 * LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
 * LinkedList is better for manipulating data.
 * <p>
 * Java LinkedList class can contain duplicate elements.
 * Java LinkedList class maintains insertion order.
 * Java LinkedList class is non synchronized.
 * In Java LinkedList class, manipulation is fast because no shifting needs to occur.
 * Java LinkedList class can be used as a list, stack or queue.
 */

//LinkedList лучше использовать, если Вы знаете, что будете часто добавлять и удалять элементы из списка.

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> music = new LinkedList<String>();
        music.add("RAP");
        music.add("HOUSE");
        music.add("ELECTRO");
        music.add("TRANCE");
        System.out.println(music);

        music.addFirst("TECHNO");
        System.out.println(music);
        music.addLast("MINIMAL");
        System.out.println(music);

        music.removeFirst();
        System.out.println(music);
        music.removeLast();
        System.out.println(music);

        System.out.println(music.getFirst());
        System.out.println(music.getLast());
    }
}