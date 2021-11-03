/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution, Exercise 40
 *  Copyright 2021 Mayank Goyal
 */

package ex40;

import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee("John","Johnson","Manager", "2016-12-31");
        emp.employees.put(1,emp);

        emp = new Employee("Tou","Xiong","Software Engineer", "2016-10-05");
        emp.employees.put(2,emp);

        emp = new Employee("Michaela","Michaelson","District Manager", "2015-12-19");
        emp.employees.put(3,emp);

        emp = new Employee("Jacquelyn","Jackson","DBA", "");
        emp.employees.put(4,emp);

        emp = new Employee("Jake","Jacobson","Programmer", "");
        emp.employees.put(5,emp);

        emp = new Employee("Sally","Webber","Web Developer", "2015-12-18");
        emp.employees.put(6,emp);

        System.out.print("Enter a search string: ");
        String search  = scanner.nextLine();

        Map<Integer, Employee> filteredList = emp.search(search);

        System.out.println("");
        System.out.println("Results:");
        System.out.println("");
        System.out.printf("%-20s %2s %-20s %2s %-20s", "Name", "|", "Position", "|", "Seperation Date");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

        int count = 0;
        for(int k : filteredList.keySet())
        {
            count++;
            System.out.format("%-20s %2s %-20s %2s %-20s",
                    filteredList.get(k).getFirstName() + " " + filteredList.get(k).getLastName(), "|", filteredList.get(k).getPosition(), "|", filteredList.get(k).getSeparationDate());
            System.out.println();

        }

        if(count == 0 )
        {
            System.out.println("No matching data employees found for search criteria: " + search);
        }
    }
}
