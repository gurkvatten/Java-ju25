package oop4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FatInterfaces {
    static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        //List<String> strings = List.of("Test");

            pause(1000);


        try {
            strings.add("Test");
            strings.get(1);
        } catch (UnsupportedOperationException e) {
            System.out.println("cant use add");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }


        System.out.println(strings.getFirst());
        example1(new String[] {"1","2"});

        example2("1","2","3");
    }

    private static void pause(long milliseconds)  {


        long t2 = milliseconds;
        do {
            long t = System.currentTimeMillis();
            try {
                Thread.sleep(t2);
            } catch (InterruptedException e) {

            } finally {
                t2 = t2 - System.currentTimeMillis() - t;
            }
        } while (t2 > 0);
    }

    public  static void example1(String[] values) {

    }
    public  static void example2(String ... values) {

    }
}
