package ss07_abstract_interface.demo;

import java.util.Comparator;

public class Pilot extends Person implements IFly, Comparable, Comparator {
    @Override
    public void love() {
        System.out.println("Tinh yeu phi cong");
    }

    @Override
    public void fly() {
        System.out.println("Bay bang phi co");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
