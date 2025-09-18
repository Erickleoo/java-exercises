package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return
                "Name: " + name + "\n"
                + "Gross salary: " + String.format("%.2f", grossSalary) + "\n"
                + "Tax: " + String.format("%.2f", tax);
    }
}
