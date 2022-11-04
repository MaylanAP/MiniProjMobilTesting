package com.example.steps;

import com.example.app.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegistrationStep {

    RegistrationPage registrationPage = new RegistrationPage();

    @And("I click register link")
    public void iClickRegisterLink() {
        registrationPage.clckRegis();
    }

    @And("I input {string} fullname")
    public void iInputFullname(String fullname) {
        registrationPage.inFullname(fullname);
    }

    @And("I input {string} new email")
    public void iInputNewEmail(String email) {
        registrationPage.inEmailRegis(email);
    }

    @And("I input {string} new password")
    public void iInputNewPassword(String password) {
        registrationPage.inPassRegis(password);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registrationPage.clckRegisButton();
    }

    @Then("I get {string} result regis")
    public void iGetResultRegis(String result) {
        if (result.equals("can regis")){
            registrationPage.canRegis();
        }
        else if (result.equals("cant regis")){
            registrationPage.cantRegis();
        }
    }
}
