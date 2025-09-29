package OOP3;

public class excersise2
{
    public static void main() {

        Bird bird = new Bird();
        Object bird1 = new Bird();
// Därför används subclasser för att en penguin kan vara ett bird object
        Bird bird2 = new Penguin();
        Penguin bird3 = new Penguin();
        // i detta exemplet kan inte en bird sparat i en penguin referens t.ex
        //Penguin bird4 = new Bird();
        bird2.eat();
        bird3.eat();
        bird3.swim();
        ((Penguin)bird2).swim();
    }


        static class Bird {
            public void eat() {

            }
        }
        static class Penguin extends Bird {
            public void swim() {
                System.out.println("i am swimming...");
            }
        }



}
