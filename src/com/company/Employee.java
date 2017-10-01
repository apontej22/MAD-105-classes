package com.company;

public class Employee {

    //private variables.
    private int employeeShift;
    private int employeeNumber;
    private String firstName;
    private String lastName;

    //constructor that initialize all variables
    //constructor was created automatically (right click, then click generate, then click constructor, select all, ok)
    public Employee(int employeeShift, int employeeNumber, String firstName, String lastName) {
        this.employeeShift = employeeShift;
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters.
    //getters and setters were created automatically
    // (right click, then click generate, then click getters and setter, select all, click ok)

    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //method to display the employee information
    public void  printInfo(){
        System.out.println("Shift number: " + employeeShift + "\nEmployee number: " + employeeNumber +
                            "\nEmployee name: " + firstName + " " + lastName + "\n");
    }
}