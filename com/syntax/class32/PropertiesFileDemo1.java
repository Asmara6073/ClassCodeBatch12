package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {
        //First step is locating the file we want to read.
        String path="Files/Config.properties";
        // navigating to the location where the file is store
        FileInputStream fileInputStream=new FileInputStream(path);
        //Special class which knows how to read the .properties file
        Properties properties=new Properties();
        //loading all the data from the file to properties object
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));


    }


}
