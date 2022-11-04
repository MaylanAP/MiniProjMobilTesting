package com.example.app.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static com.example.app.drivers.AndroidDriverInit.driver;

public class LoginPage {

    private By productHead = MobileBy.AccessibilityId("Products");
    private By signIn = By.xpath("//android.view.View[1]/android.widget.Button");
    private By emailPath = By.xpath("//android.widget.EditText[1]");
    private By passPath = By.xpath("//android.widget.EditText[2]");
    private By loginButton = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    private By succLogin = By.xpath("//android.view.View[1]/android.widget.Button");
    private By errorEmail = MobileBy.AccessibilityId("email can not empty");
    private By errorPass = MobileBy.AccessibilityId("password can not empty");
    private By errorMess = MobileBy.AccessibilityId("Email atau password tidak valid.");

    public void seeHeadProduct(){
        AndroidElement headProd = driver.findElement(productHead);
        headProd.isDisplayed();
    }
    public void clckSignIn(){
        AndroidElement clckToLog = driver.findElement(signIn);
        clckToLog.click();
    }
    public void inputEmail(String email){
        AndroidElement inEmail = driver.findElement(emailPath);
        inEmail.sendKeys(email);
    }
    public void inputPass(String password){
        AndroidElement inPass = driver.findElement(passPath);
        inPass.sendKeys(password);
    }
    public void clckLogButton(){
        AndroidElement logButt = driver.findElement(loginButton);
        logButt.click();
    }
    public void succesLogin(){
        AndroidElement canLog = driver.findElement(succLogin);
        canLog.isDisplayed();
    }
    public void emailError(){
        AndroidElement errEm = driver.findElement(errorEmail);
        errEm.isDisplayed();
    }
    public void passError(){
        AndroidElement errPass = driver.findElement(errorPass);
        errPass.isDisplayed();
    }
    public void messError(){
        AndroidElement errMess = driver.findElement(errorMess);
        errMess.isDisplayed();
    }

}
