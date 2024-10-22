package com.yash.oops;
/*
Make a parent class Person.
Make Employee, UnEmployed and SelfEmployed as the subclasses.
 Make calculateSalary method as a base method in Person class.
Override this calculation method in all the other classes (Employee, Unemployed, and SelfEmployed)
Make parameterized constructor in individual derived subclasses which takes
calculation parameters (like tax %, Salary, etc) as parameters and does the salary calculations.
Make another class CalculateSalary with overloaded parameterized constructors.
These parameterized constructors take empType and other parameters as tax%, salary etc.
and calculates the salary.
Make use of access Specifies in the above program:
Make the calculateArea method private in the parent class.
Make the overridden methods public in the subclasses.

 */
class Persons
{
    private void calculateSalary() {
        System.out.println("Base Salary Calculation in Person Class");
    }

}
class Employee extends Persons
{
    private double salary;
    private double tax;

    // Parameterized constructor for Employee
    public Employee(double salary, double tax) {
        this.salary = salary;
        this.tax = tax;
    }

    // Overridden method for salary calculation

    public void calculateSalary() {
        double finalSalary = salary - (salary * tax / 100);
        System.out.println("Employee's salary after tax: " + finalSalary);
    }

}
class Unemployed extends Persons
{
    private double unemploymentBenefit;

    // Parameterized constructor for Unemployed
    public Unemployed(double unemploymentBenefit) {
        this.unemploymentBenefit = unemploymentBenefit;
    }

    // Overridden method for salary calculation
    public void calculateSalary() {
        System.out.println("Unemployed person receives benefit: " + unemploymentBenefit);
    }
}
class SelfEmployed extends Persons
{
    private double income;
    private double businessExpenses;

    // Parameterized constructor for SelfEmployed
    public SelfEmployed(double income, double businessExpenses) {
        this.income = income;
        this.businessExpenses = businessExpenses;
    }

    // Overridden method for salary calculation
    public void calculateSalary() {
        double finalIncome = income - businessExpenses;
        System.out.println("Self-Employed person's final income: " + finalIncome);
    }
}

class CalculateSalary {
    // Overloaded constructors
    public CalculateSalary(String empType, double salary, double tax) {
        if (empType.equals("Employee")) {
            Employee emp = new Employee(salary, tax);
            emp.calculateSalary();
        }
    }

    public CalculateSalary(String empType, double unemploymentBenefit) {
        if (empType.equals("Unemployed")) {
            Unemployed unemp = new Unemployed(unemploymentBenefit);
            unemp.calculateSalary();
        }
    }
    public CalculateSalary(String empType, int income, double expenses) {
        if (empType.equals("SelfEmployed")) {
            SelfEmployed selfEmp = new SelfEmployed(income, expenses);
            selfEmp.calculateSalary();
        }
    }
}

// Class to Calculate Salary based on employee type and parameters


public class Main{

    public static void main(String[] args) {
        new CalculateSalary("Employee", 50000, 10); // Employee case
        new CalculateSalary("Unemployed", 2000);    // Unemployed case
        new CalculateSalary("SelfEmployed", 60000, 10000); // Self-Employed case
    }
}
