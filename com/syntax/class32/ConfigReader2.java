package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader2 {


    static Properties prop;
    public static void loadPropertyFile(String path){
        try{
            FileInputStream fs=new FileInputStream(path);
             prop=new Properties();
            prop.load(fs);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
       return prop.getProperty(key);
    }

}
