package com.pages;

import com.qa.driver.BaseInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    private WebDriver driver;
    private By checkForLandingPage=By.xpath("//*[contains(text(),'Sign in')]");
    private By searchField= By.xpath("//input[@type='text']");
    private By selectLink=By.xpath("//*[contains(text(),'J.P. Morgan | Official Website')]");
    private By companyLogo=By.xpath("//*[@class='welcome-section']");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
    public String checkForGoogle(){
        return driver.findElement(checkForLandingPage).getText();
    }
    public void searchBy(String companyName){
        driver.findElement(searchField).sendKeys(companyName);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        driver.findElement(selectLink).click();
    }

    public String returnCompanyLogo(){
        return driver.findElement(companyLogo).getText();


    }


}
