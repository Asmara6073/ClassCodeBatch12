package ReplitHelp;

import org.apache.poi.ss.formula.functions.Single;

public class Singleton {

    private static Singleton obj;// declare object of singletone as private and static

    private Singleton(){}// private constructor means it will not be instantiated

    public static Singleton getInstance(){

        if(obj==null){// if there is no object then instantiate an object of Singleton class
            obj=new Singleton();
        }

        return obj; // return the object
    }

} class InstanceOfSingleton{

    Singleton obj= Singleton.getInstance();








}


