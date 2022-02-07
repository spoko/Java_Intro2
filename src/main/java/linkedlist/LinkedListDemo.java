package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add(0, "Mercedes");
        cars.add("Audi");

        System.out.println("Cars before sell are: " + cars);

        cars.remove("Audi");
        cars.remove(0);

        System.out.println("Cars before sell are: " + cars);
    }
}
