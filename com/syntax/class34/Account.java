package com.syntax.class34;

public class Account<calculator> {
    double balance;

    public void setBalance(double balance) throws InsufficientBalance {
        if(balance<0){
            throw new InsufficientBalance("can't set negative balance");
        }else{
            this.balance=balance;
        }
    }

    public void Calculate(int i, int b){
        Calculator calc=new Calculator();
        calc.DoTheMath(i,b);
    }

    public static void main(String[] args) {
        Account acc=new Account();

        acc.Calculate(6,8);


    }
}
