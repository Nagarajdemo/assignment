package com.qa.driver;

import org.openqa.selenium.WebDriver;

public class Base {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> webDriverThreadLocal=new ThreadLocal<>();
    public void initialiseDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){

        }
    }
}
