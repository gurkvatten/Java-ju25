package oop4;

import java.util.*;
import java.util.function.Consumer;

public class CollectionDemo {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        for (var i : list) {
            System.out.println(i);
        }

        Set<Integer> IntSet = new HashSet<>();
        IntSet.add(1);
        IntSet.add(2);
        IntSet.add(3);
        IntSet.add(1);
        if (IntSet.contains(1)) {
            System.out.println("yup");
        }

        for (var i : IntSet) {
            System.out.println(i);
        }

        System.out.println("===========");

        Set<MyType> myTypeSet = new HashSet<>();

        var myType = new MyType(1);
        myTypeSet.add(myType);
        myTypeSet.add(new MyType(1));
        myTypeSet.add(new MyType(2));
        myTypeSet.add(new MyType(3));
        myTypeSet.add(new MyType(1));

        for (var i : myTypeSet) {
            System.out.println(i.getValue());
        }
        System.out.println("========");
        // dont store mutable objects in set if someone has outside reference
        myType.setValue(2);
        for (var i : myTypeSet) {
            System.out.println(i.getValue());
        }

    }
}

class MyType {
    private int value;

    public MyType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MyType myType)) return false;
        return value == myType.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}






