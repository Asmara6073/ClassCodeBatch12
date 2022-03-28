package com.syntax.class26;

public abstract class SmartWatch {

    //we can have instance variables in an abstract class
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime=true;


    SmartWatch(int RAM, int ROM, double displaySize,String make){
        this.RAM=RAM;
        this.ROM=ROM;
        this.displaySize=displaySize;
        this.make=make;
    }

    // access modifier-->non access modifier-->return type
    public abstract void showHealthTips();
    public void updateOS(){
        checkOSUpdate();
        downloadUpdate();
        installUpdate();
        System.out.println("Updating the OS");
    }
    private void checkOSUpdate(){
        System.out.println("Checking if update is available");
    }
    private void downloadUpdate(){
        System.out.println("downloading the update i");
    }
    private void installUpdate(){
        System.out.println("installing the update");
    }
}

class AppleWatch extends SmartWatch{


    AppleWatch(int RAM, int ROM, double displaySize, String make) {
        super(RAM, ROM, displaySize, make);
    }

    @Override
    public void showHealthTips() {
        System.out.println("use health app to check the details");
    }
}