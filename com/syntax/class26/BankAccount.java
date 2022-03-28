package com.syntax.class26;

public class BankAccount {

    private double balance=1235;
    private String userName="Habib";
    private String password="Habib123";

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void printBalance(String userName, String password){
        if(this.userName.equals(userName)&&this.password.equals(password))  {
            System.out.println(balance);
        }else{
            System.out.println("Incorrect credentials");
        }

    }


}

class BankAccountTester{
    public static void main(String[] args) {


        BankAccount account1=new BankAccount();
        account1.printBalance("Habib","Habib123");


    }


}
