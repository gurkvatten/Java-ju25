package oop4;

public class LinkedList {

    Node first =  null;
    Node last = null;

    public void add(String value){
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

    public String get(int index){
        return "";
    }

    static void main() {
        LinkedList list = new LinkedList();
        list.add("Number 1");
        list.add("Number 2");
        list.add("Number 3");


    }
}

class Node {
    String value;
    Node next;




}