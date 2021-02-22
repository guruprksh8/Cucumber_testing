package com.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {
    fizzbuzz ob;
    String got;
    @Given("^Create a fizzbuzz game$")
    public void createAFizzbuzzGame() {
        ob = new fizzbuzz();
    }

    @When("^played with num (\\d+)$")
    public void playedWithNum(int number) {
        got = ob.output(number);
    }

    @Then("^for result as \"([^\"]*)\"$")
    public void forResultAs(String exp){
        Assertions.assertEquals(exp, got);
    }
}
