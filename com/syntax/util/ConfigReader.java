package com.syntax.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getProperty(String key) throws IOException {

        String path = "Files/Config.properties";
        // navigating to the location where the file is stored
        FileInputStream fileInputStream = new FileInputStream(path);
        //Special class which knows how to read the .properties file
        Properties properties = new Properties();
        //loading all the data from the file to properties object
        properties.load(fileInputStream);
        return properties.getProperty(key);

    }



}
