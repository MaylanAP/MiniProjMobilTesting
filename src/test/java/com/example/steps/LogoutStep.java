package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStep {

    LogoutPage logoutPage = new LogoutPage();

    @When("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.clckLogout();
    }

    @Then("I in the page home")
    public void iInThePageHome() {
        logoutPage.seeSign();
    }
}
