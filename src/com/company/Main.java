package com.company;

/* Program with a class that accepts different employee information as parameters.
* The program calls the class and instantiates the class with the information of 3 employees.
* Then the information is displayed.*/

public class Main {

    public static void main(String[] args) {

        //instances of employees
        Employee employee1 = new Employee (2, 21100,
                "David", "Smith");
        Employee employee2 = new Employee(3, 37500,
                "Thomas", "Anderson");
        Employee employee3 = new Employee(1, 14600,
                "Joshua", "Harrison");


        employee1.printInfo();
        System.out.println("\n");
        employee2.printInfo();
        System.out.println("\n");
        employee3.printInfo();
        System.out.println("\n");


    }
}
