package ReplitHelp;

import java.io.*;
import java.util.Properties;

public class PropertyFilePractice {

    public static String path="Files/Config2.properties";
    public static void main(String[] args) throws IOException {

        /**
         * Got to config2.properties
         * add usernmae 3 and password 3
         */
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();

        properties.load(fileInputStream);

        properties.put("Username3","Bethann");
        properties.put("Password3","Lungamai");

        FileOutputStream fileOutputStream=new FileOutputStream(path);

        properties.store(fileOutputStream,"New username and password");


    }

}
