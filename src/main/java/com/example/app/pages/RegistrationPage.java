package com.example.app.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class RegistrationPage {

    private By regisLink = MobileBy.AccessibilityId("Register");
    private By fullNameIn = By.xpath("//android.widget.EditText[1]");
    private By emailIn = By.xpath("//android.widget.EditText[2]");
    private By passIn = By.xpath("//android.widget.EditText[3]");
    private By regisButton = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By successRegis = By.xpath("//android.view.View[1]/android.widget.Button");
    private By errorRegis = MobileBy.AccessibilityId("Gagal :(");

    public void clckRegis(){
        AndroidElement clckRegisLink = driver.findElement(regisLink);
        clckRegisLink.click();
    }
    public void inFullname(String fullname){
        AndroidElement inName = driver.findElement(fullNameIn);
        inName.sendKeys(fullname);
    }
    public void inEmailRegis(String email){
        AndroidElement inEmRegis = driver.findElement(emailIn);
        inEmRegis.sendKeys(email);
    }
    public void inPassRegis(String password){
        AndroidElement inPassRegis = driver.findElement(passIn);
        inPassRegis.sendKeys(password);
    }
    public void clckRegisButton(){
        AndroidElement buttonRegis = driver.findElement(regisButton);
        buttonRegis.click();
    }
    public void canRegis(){
        AndroidElement canRegis = driver.findElement(successRegis);
        canRegis.isDisplayed();
    }
    public void cantRegis(){
        AndroidElement cantRegis = driver.findElement(errorRegis);
        cantRegis.isDisplayed();
    }

}
