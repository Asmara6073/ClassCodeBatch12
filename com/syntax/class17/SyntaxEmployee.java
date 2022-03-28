package com.syntax.class17;

public class SyntaxEmployee {

    String empID;
    int salary;
    static String CEO="Sumair";


    public static void main(String[] args) {

        SyntaxEmployee emp1=new SyntaxEmployee();

        emp1.empID="SE123";
        emp1.salary=85000;
        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(SyntaxEmployee.CEO);

    }
}

