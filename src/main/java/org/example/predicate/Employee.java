package org.example.predicate;

public class Employee {
    private String eName;
    private int eSalary;

    public Employee(String eName, int eSalary) {
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }
}
