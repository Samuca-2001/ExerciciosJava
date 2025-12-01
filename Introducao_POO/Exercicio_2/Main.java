package Exercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = ler.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = ler.nextDouble();
        System.out.print("Tax: ");
        employee.tax = ler.nextDouble();

        System.out.println("Employee: " + employee.name + ", $" + employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = ler.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee.name + ", $" + employee.netSalary());

        ler.close();
    }
}
