package com.nextBaseCrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);


    }
}
