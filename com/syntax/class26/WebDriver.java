package com.syntax.class26;
/*Create a WebDriver Interface that will have the following unimplemented behaviour:
   openBrowser(), closeBrowser(), maximizeWindow(), findElement().
   Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    */
 interface WebDriver{

   void openBrowser();
   void closeBrowser();
   void maximizeWindow();
   void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Google Chrome browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Google Chrome browser is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Google Chrome window maximized");
    }

    @Override
    public void findElement() {
        System.out.println("Find element on google chrome page");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("FireFox browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("FireFox browser is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("FireFox window maximized");
    }

    @Override
    public void findElement() {
        System.out.println("Find element on FireFox page");
    }
}
