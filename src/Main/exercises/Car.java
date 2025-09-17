package Main.exercises;

public class Car {
    private String name;
    private String model;
    private int price;
    private String color;

    public Car(String name, String model, int price, String color) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Car () {
        this.name = name;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void halfPrice() {
        this.price = price / 2;
        System.out.println("Half price: " + price);
    }

    static void main(String[] args) {
        Car car1 = new Car("Ford","sedan",2000,"red");
        Car car2 = new Car("Volvo","Kombi",6000,"blue");
        Car car3 = new Car("Nissan","sedan",10000,"green");
    }
}
