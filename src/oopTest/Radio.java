package oopTest;

import java.util.ArrayList;

public class Radio extends Station implements RarioPlayer, RadioSwitcher {
    private ArrayList<String> raidoList;

    public Radio() {
    }

    public Radio(ArrayList<String> raidoList) {
        this.raidoList = raidoList;
    }

    public ArrayList<String> getRaidoList() {
        return raidoList;
    }

    public void setRaidoList(ArrayList<String> raidoList) {
        this.raidoList = raidoList;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "raidoList=" + raidoList +
                '}';
    }

    @Override
    public void radioPlay() {
        System.out.println("Radio is playing");
    }

    @Override
    public void radioStop() {
        System.out.println("Radio is stopped");
    }

    @Override
    public void radioPause() {
        System.out.println("Radio on pause");
    }

    @Override
    public void switchRadio() {
        System.out.println("Switch radio");
    }

    @Override
    public void tuneRadioStation() {
        System.out.println("Tune station");
    }
}
