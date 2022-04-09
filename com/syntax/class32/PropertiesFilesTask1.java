package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesTask1 {
    public static void main(String[] args) throws IOException {

        //path of file
        String path="Files/Config.properties";// path of file
        // FileInputStream helps us read the data from a file
        FileInputStream fileInputStream=new FileInputStream(path);
        // Special class that lets us read the data from .properties
        Properties properties=new Properties();
        //Reading the exisisting data and storing in the properties class
        properties.load(fileInputStream);
        //adding new properties
        properties.put("URL","www.Google.com");
        // Creating a file on mentioned path
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //Storing all the data from the object inside that file
        properties.store(fileOutputStream,"added new property URL");





    }
}
