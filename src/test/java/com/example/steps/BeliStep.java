package com.example.steps;

import com.example.app.pages.BeliPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeliStep {

    BeliPage beliPage = new BeliPage();

    @When("I click beli button product 1")
    public void iClickBeliButtonProduct1() {
        beliPage.clckProd1();
    }

    @And("I click beli button product 2")
    public void iClickBeliButtonProduct2() {
        beliPage.clckProd2();
    }

    @Then("product increases")
    public void productIncreases() {
        beliPage.totalProd();
    }

    @And("I click beli button product 3")
    public void iClickBeliButtonProduct3() {
        beliPage.clckProd3();
    }
}
