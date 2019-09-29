/**
 * CS 105 Theory and Practice I
 * CRN: [38065]
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [xiaoyanwei]
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {
    public String employeeName;
    public double currentSalary;
    public double byPercent;
    public double raiseSalary;
    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    public Employee(String employeeName, double currentSalary) {
        this.employeeName=employeeName;
        this.currentSalary=currentSalary;
		// TODO: Initialize instance variables from constructor (ctor) parameters
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    public String getName() {
        return employeeName;
		// TODO: Return the name of the employee;
    }

    public double getSalary() {
        return currentSalary;
		// TODO: Return the current salary of the employee
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {
        currentSalary = (1 + byPercent/100) * currentSalary;
        
		// TODO: Calculate the new salary by increasing it by the percent passed in as a method argument
    }
}