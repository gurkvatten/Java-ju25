package OOP3.employees;

import java.util.Objects;

public final class Manager extends Employee {

    private Double baseSalary;

    public Manager(String name, Double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if( obj instanceof Manager  manager) {
           return this.name.equals(manager.name) && this.baseSalary == manager.baseSalary;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(baseSalary);
    }

    @Override
    public String work() {
        return name + " is managing the team";
    }
}

