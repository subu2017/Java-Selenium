package com.learnJava.classandobjects;

/**
 * Created by z001qgd on 9/20/17.
 */
public class Employee {

    private static String company = "XYZ";
    private String firstName;
    private String lastName;
    private int age;

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method returns the full name
     * @param
     */

    public String fullName(Employee employee1){

        return employee1.firstName.concat(employee1.lastName);

    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setAge(1);
        employee.setFirstName("Dilip");
        employee.setLastName("Sundarraj");

        String fullname = employee.fullName(employee);

        System.out.println("Full Name is : " + fullname);
    }

}
