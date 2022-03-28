package com.syntax.class25;

public class BrowserTester {

    public static void main(String[] args) {

        Browser [] browsers={new GoogleChrome(),
        new FireFox(),new Safari(), new IE()};

        for (Browser b:browsers){
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }


    }
}
