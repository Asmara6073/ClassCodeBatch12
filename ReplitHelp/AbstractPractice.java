package ReplitHelp;

public class AbstractPractice {


}
abstract class Animal{

    static int age;
    abstract void eat();
    abstract void animalSound();
    void sleep(){
        System.out.println( "is sleeping");
    }

}class Pig extends Animal{



    void eat(){
        System.out.println("Pig is eating");
    }

    void animalSound(){
        System.out.println("Oink Oink");
    }

    public static void main(String[] args) {



    }


}class Lion extends Animal{




    @Override
    void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    void animalSound() {
        System.out.println("Roar Roar");
    }

    public static void main(String[] args) {


        Animal animals []={new Lion(),new Pig()};

        for(Animal a:animals){
            a.sleep();
            a.animalSound();
            a.eat();

        }

    }



}
