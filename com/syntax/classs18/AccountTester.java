package com.syntax.classs18;

public class AccountTester {
    public static void main(String[] args) {

        Account account=new Account();
       // account.printUserName(); has private access
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();



    }

}
