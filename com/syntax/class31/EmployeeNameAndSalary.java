package com.syntax.class31;

import java.util.*;

public class EmployeeNameAndSalary {
    /*Create a Map that will store Employee name and salary.
     *Write a logic to retrieve an employee who gets the highest salary.
     *Output should be in the below format
     * John Smith=$100000
     */

    public static void main(String[] args) {

        HashMap<String, Integer> employee = new HashMap<>();

        employee.put("Tarik", 85000);
        employee.put("Abby", 89000);
        employee.put("Bethann", 100000);


        int highestSalary= Collections.max(employee.values());

        for(Map.Entry<String,Integer> employees: employee.entrySet()){
            if(employees.getValue()==highestSalary){
                System.out.println(employees);
            }
        }


        String name=null;
        Integer salary=0;

        for(Map.Entry<String,Integer> entry:employee.entrySet()){
            if(entry.getValue()>salary){
                salary= entry.getValue();
                name= entry.getKey();
            }


        }
        System.out.println(name+" =$"+salary);

    }




}
