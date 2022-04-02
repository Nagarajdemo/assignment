package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

    @Given("I have to search companyName via google")
    public void i_have_to_search_company_name_via_google() {
        System.out.println("In Given");
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I enter the {string} in the search field")
    public void i_enter_the_in_the_search_field(String companyName) {
        System.out.println("when "+companyName);
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("validate the company logo")
    public void validate_the_company_logo() {
        System.out.println("then ");
        // Write code here that turns the phrase above into concrete actions

    }



}
