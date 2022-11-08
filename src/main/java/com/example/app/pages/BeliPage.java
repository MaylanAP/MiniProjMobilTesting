package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class BeliPage extends BasePageObject {

    private By prod1 = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    private By prod2 = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[4]");
    private By prodAdd = By.xpath("//android.widget.Button[@content-desc=\"2\"]");
    private By prod3 = By.xpath("//android.widget.Button[@content-desc=\"Beli\"]");

    public void clckProd1(){
        click(prod1);
    }
    public void clckProd2(){
        click(prod2);
    }
    public void totalProd(){
        isDisplayed(prodAdd);
    }
    public void clckProd3(){
        scrollAndClickBytext("Sony PS5");
        click(prod3);
    }

}
