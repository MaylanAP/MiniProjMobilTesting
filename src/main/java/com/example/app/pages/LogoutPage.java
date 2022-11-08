package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {

    private By logButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    private By signIn = By.xpath("//android.view.View[1]/android.widget.Button");

    public void clckLogout(){
        click(logButton);
    }
    public void seeSign(){
        isDisplayed(signIn);
    }

}
