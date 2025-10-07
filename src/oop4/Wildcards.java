package oop4;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    static void main(){
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        strings.add("a");
        integers.add(1);
        printList(integers);
        printList(strings);


    }

    public static void printList(List<?> theList){
        for (var e : theList){
            System.out.println(e);
        }

    }
}
