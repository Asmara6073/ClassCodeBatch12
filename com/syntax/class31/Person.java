package com.syntax.class31;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Person {
    /*Create a Person class with following private fields: name, lastName, age, salary.
      *Variables should be initialized through constructor.
      * Inside the class also create a method to print user details.
      *  In Test Class create a Map that will store key in ascending order.
      * In that map store personId and a Person Object. Print each object details.
     */

private String firstName;
private String lastName;
private int age;
private int salary;

Person(String firstName,String lastName,int age,int salary){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.salary=salary;
}

public void printDetails(){
    System.out.println("First name: "+firstName +"\n"+"Last name: "+lastName +"\n"+" Age: "+age+"\n"+"Salary: "+salary);
}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class PersonTest extends Person{

    PersonTest(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age, salary);
    }

    public static void main(String[] args) {

        TreeMap<String,Person> people=new TreeMap<>();
        people.put("A1234",new Person("Tarik","Abraham",24,75000));
        people.put("A12345",new Person("Abby","Abraham",23,80000));
        people.put("A123456",new Person("Bethann","Mwombela",23,57000));

        for(Map.Entry<String,Person>p:people.entrySet()){
            System.out.println(p.getKey()+": "+ p.getValue());
        }

        Iterator<Map.Entry<String,Person>> itr=people.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String,Person> p=itr.next();
            System.out.println(p.getKey()+": "+p.getValue());
        }

    }


}
