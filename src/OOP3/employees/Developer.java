package OOP3.employees;

public class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;


    public Developer(String name,double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String work()
    {
        return name + " is debugging code";
    }

    @Override
    public String toString() {
        return "Developer{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                '}';
    }
}
