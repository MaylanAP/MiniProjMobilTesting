package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("I am on alta shop")
    public void iAmOnAltaShop() {
        loginPage.seeHeadProduct();
    }

    @When("I click sign in button")
    public void iClickSignInButton() {
        loginPage.clckSignIn();
    }

    @And("I input {string} email")
    public void iInputEmail(String email) {
        loginPage.inputEmail(email);
    }

    @And("I input {string} password")
    public void iInputPassword(String password) {
        loginPage.inputPass(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clckLogButton();
    }

    @Then("I get {string} result")
    public void iGetResult(String result) {
        switch (result) {
            case "can login":
                loginPage.succesLogin();
                break;
            case "error email":
                loginPage.emailError();
                break;
            case "error password":
                loginPage.passError();
                break;
            case "error message":
                loginPage.messError();
                break;
        }
    }
}
