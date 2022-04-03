package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    public static FileInputStream file;

    /**
     * Following method is to read from config.properties file and return the properties Obj.
     * We can enhance the same by passing the config path, currently it is hardcoded to refer only one file
     * @return
     * @throws IOException
     */
    public Properties initialiseProperties() throws IOException {
        properties=new Properties();
        file = new FileInputStream("src/test/config/config.properties");
        properties.load(file);
        return properties;

    }

}
