package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class RegistrationPage extends BasePageObject {

    private By regisLink = MobileBy.AccessibilityId("Register");
    private By fullNameIn = By.xpath("//android.widget.EditText[1]");
    private By emailIn = By.xpath("//android.widget.EditText[2]");
    private By passIn = By.xpath("//android.widget.EditText[3]");
    private By regisButton = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By successRegis = By.xpath("//android.view.View[1]/android.widget.Button");
    private By errorRegis = MobileBy.AccessibilityId("Gagal :(");
    private By errName = MobileBy.AccessibilityId("fullname can not empty");
    private By errEmail = MobileBy.AccessibilityId("email can not empty");
    private By errPass = MobileBy.AccessibilityId("password can not empty");

    public void clckRegis(){
        click(regisLink);
    }
    public void inFullname(String fullname){
        click(fullNameIn);
        inputText(fullNameIn,fullname);
    }
    public void inEmailRegis(String email){
        click(emailIn);
        inputText(emailIn,email);
    }
    public void inPassRegis(String password){
        click(passIn);
        inputText(passIn,password);
    }
    public void clckRegisButton(){
        click(regisButton);
    }
    public void canRegis(){
        isDisplayed(successRegis);
    }
    public void cantRegis(){
        isDisplayed(errorRegis);
    }
    public void setErrName(){
        isDisplayed(errName);
    }
    public void setErrEmail(){
        isDisplayed(errEmail);
    }
    public void setErrPass(){
        isDisplayed(errPass);
    }


}
