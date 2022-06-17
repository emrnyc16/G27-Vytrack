package com.vytrack.tests.user_stories.emrepackage.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- we created our properties object
    private static Properties properties = new Properties();


    static{
        //2- get the path and store in String, or directly pass into fileInputStream obj
        String path="configuration.properties";

        try {
            //3- we need to open the file
            FileInputStream file = new FileInputStream(path);

            //4- we need to load the file
            properties.load(file);

            //5- close.file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
    }

    // Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}