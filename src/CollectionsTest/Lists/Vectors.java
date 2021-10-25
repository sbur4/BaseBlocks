package CollectionsTest.Lists;

import java.util.List;
import java.util.Vector;

/**
 * Vector is like the dynamic array which can grow or shrink its size.
 * Vector is synchronized.
 * Java Vector contains many legacy methods that are not the part of a collections framework.
 **/

public class Vectors {
    public static void main(String[] args) {
        List<Integer> vecList = new Vector<>();
        vecList.add(1);
        System.out.println(vecList);
        vecList.add(0,2);
        System.out.println(vecList);
    }
}
