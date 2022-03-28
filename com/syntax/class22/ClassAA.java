package com.syntax.class22;

public class ClassAA {
String name;
int age;
double weight;

public ClassAA(String name, int age, double weight){
    this.name=name;
    this.age=age;
    this.weight=weight;
}

void printInfo(){
    System.out.println(name+" "+age+" "+weight);
}


}

class ClassBB extends ClassAA{
    public ClassBB(String name, int age, double weight){
        super(name,age,weight);
     /* Because constructors from the parent class don't participate in inheritance
        we need to create a matching constructor in the child classes as well
        We can use the super() to call the parent class so that we don't have to repeat the code
      */
}

}

class Test{
    public static void main(String[] args) {
        ClassBB classBB=new ClassBB("Tarik",24,177);
        classBB.printInfo();
    }


}
