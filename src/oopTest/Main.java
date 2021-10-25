package oopTest;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        ArrayList<String> list = new ArrayList<>();
        list.add("djfm");
        list.add("fgdjradio");
        list.add("hotjamzny");
        radio.setRaidoList(list);
        System.out.println(radio.toString());

        Iterator<String> it = list.listIterator();
        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
            if (it.next().equals("djfm")) {
                radio.switchRadio();
                radio.radioPlay();
                break;
            }else {
                System.out.println("Haven't radio in playlist");
            }
        }

    }
}
