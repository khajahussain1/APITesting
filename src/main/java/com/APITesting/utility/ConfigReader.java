package com.APITesting.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    private static final String CONFIH_FILE_PATH = "src/main/resources/config.properties";
    private static final Properties properties;

    static {
        properties = new Properties();

            try {
                FileInputStream fis = new FileInputStream(CONFIH_FILE_PATH);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }




    public static String getBaseURl(){
        return properties.getProperty("BaseURL");
    }

    public static String gethosturl(){
        return getBaseURl()+properties.getProperty("HostURL");
    }

    public static String getBererToken(){
        return properties.getProperty("BearerToken");
    }

    public static String getEndPontURL(){
        return properties.getProperty("EndPontURL");
    }

}
