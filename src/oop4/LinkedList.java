package oop4;

import java.time.LocalDate;

public class LinkedList <T> {

    Node first =  null;
    Node last = null;

    public void add(T value){
        if(first == null){
            first = new Node();
            first.value = value;
            last = first;
        }
        else{
            Node next = new Node();
            last.next = next;
            last = next;
            last.value = value;
        }
        // Alternative solution without last pointer
        // Node temp = first;
        //while(temp.next != null){
        //    temp = temp.next;
        //}
    }

    public T get(int index){

        int counter = 0;
        Node temp = first;
        if(temp == null){
            throw new IndexOutOfBoundsException();
        }
        while(counter < index){
            if(temp == null){
                throw new IndexOutOfBoundsException();
            }
            temp = temp.next;
            counter++;
        }
        return temp.value;
    }

    class Node {
        T value;
        Node next;

    }

    static void main() {
        LinkedList<String> list = new LinkedList<>();
        //list.get(0);
        list.add("Number 1");
        list.add("Number 2");
        list.add("Number 3");
        System.out.println(list.get(1));


        LinkedList<LocalDate> dates = new LinkedList<>();
        dates.add(LocalDate.now());



    }
}

