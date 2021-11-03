/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution, Exercise 40
 *  Copyright 2021 Mayank Goyal
 */

package ex40;

import java.util.TreeMap;

public class Employee
{
    static TreeMap<Integer, Employee> employees = new TreeMap<>();

    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getSeparationDate() { return separationDate; }
    public void setSeparationDate(String separationDate) { this.separationDate = separationDate; }

    @Override
    public String toString() {
        return "Employee[ " + "firstName=" + firstName + ", lastName=" + lastName
                + ", position=" + position + ", separationDate=" + separationDate + " ]";
    }

    public static TreeMap<Integer, Employee> search(String name)
    {
        TreeMap<Integer, Employee> filteredList = new TreeMap<>();
        String src = name.toLowerCase();
        for(int k : employees.keySet())
        {
            if(employees.get(k).getFirstName().toLowerCase().contains(src) ||
                    employees.get(k).getLastName().toLowerCase().contains(src))
            {
                filteredList.put(k, employees.get(k));
            }
        }
        return filteredList;
    }
}
