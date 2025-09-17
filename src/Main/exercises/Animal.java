package Main.exercises;

import java.util.Arrays;
import java.util.Objects;

public class Animal {
        private String name;
        private String diet;
        private String age;

    public Animal(String age, String diet, String name) {
        this.age = age;
        this.diet = diet;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(diet, animal.diet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, diet, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", age=" + age +
                '}';
    }

    public void printAnimal() {
        System.out.println("Animal name: " + name + ", diet: " + diet + ", age: " + age);
    }

    static void main(String[] args) {
        Animal animal1 = new Animal("3","herbivore","Giraffe");
        Animal animal2 = new Animal("2","carnivore","Lion");
        Animal animal3 = new Animal("10","carnivore","Tiger");

        animal1.printAnimal();
        animal2.printAnimal();
        animal3.printAnimal();
    }

}
