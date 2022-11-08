package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static com.example.app.drivers.AndroidDriverInit.driver;

public class LoginPage extends BasePageObject {

    private By productHead = MobileBy.AccessibilityId("Products");
    private By signIn = By.xpath("//android.view.View[1]/android.widget.Button");
    private By emailPath = By.xpath("//android.widget.EditText[1]");
    private By passPath = By.xpath("//android.widget.EditText[2]");
    private By loginButton = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    private By succLogin = By.xpath("//android.view.View[1]/android.widget.Button");
    private By errorEmail = MobileBy.AccessibilityId("email can not empty");
    private By errorPass = MobileBy.AccessibilityId("password can not empty");
    private By errorMess = By.xpath("//android.view.View[@content-desc='Email atau password tidak valid.']");

    public void seeHeadProduct(){
        isDisplayed(productHead);
    }
    public void clckSignIn(){
        click(signIn);
    }
    public void inputEmail(String email){
        click(emailPath);
        inputText(emailPath,email);
    }
    public void inputPass(String password){
        click(passPath);
        inputText(passPath,password);
    }
    public void clckLogButton(){
        click(loginButton);
    }
    public void succesLogin(){
        isDisplayed(succLogin);
    }
    public void emailError(){
        isDisplayed(errorEmail);
    }
    public void passError(){
        isDisplayed(errorPass);
    }
    public void messError() throws InterruptedException {
        Thread.sleep(2000);
        isDisplayed(errorMess);
    }

}
