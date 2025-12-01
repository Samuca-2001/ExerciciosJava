package Exercicio_2;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentagem){
        grossSalary = grossSalary + (grossSalary * percentagem / 100.00);
    }
}
