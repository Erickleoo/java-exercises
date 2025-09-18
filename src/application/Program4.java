package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        employee.name = "João Silva";
        employee.grossSalary = 6000.00;
        employee.tax = 1000.00;

        System.out.println(employee);

        System.out.println();
        System.out.printf("Employee: %s, $ %.2f", employee.name, employee.netSalary());

        System.out.println();
        System.out.println("Which percentage to inscrease salary?" );
        double percentagem = sc.nextDouble();
        employee.increaseSalary(percentagem);

        System.out.println();
        System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.netSalary());
    }
}
