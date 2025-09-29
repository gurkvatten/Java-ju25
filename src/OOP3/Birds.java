package OOP3;

public class Birds
{
    public static void main() {

        Bird bird = new Bird();
        Object bird1 = new Bird();
// Därför används subclasser för att en penguin kan vara ett bird object
        Bird bird2 = new Penguin();
        Penguin bird3 = new Penguin();
        // i detta exemplet kan inte en bird sparat i en penguin referens t.ex
        //Penguin bird4 = new Bird();
        bird.eat();
        bird2.eat();
        bird3.eat();
        bird3.swim();

        System.out.println(bird);
        System.out.println(bird2);
        System.out.println(bird3);

        Bird.describe();
        Penguin.describe();
        bird.describe();
        bird2.describe();
        bird3.describe();


    }


        static class Bird {
            public void eat() {
                System.out.println("Bird eating...");
            }
            @Override
            public String toString() {
                return "Bird";
            }

            public static void describe()
            {
                System.out.println("birds poop...");
            }


        }
        static class Penguin extends Bird {
            @Override
            public void eat() {
                System.out.println("Penguin eating...");
            }

            public void swim() {
                System.out.println("Penguin swimming...");
            }

            @Override
            public String toString() {
                return "Penguin";
            }
            public  static void describe()
            {
                System.out.println("penguins swim...");
            }
        }



}
