package stepdefinitions;

import com.pages.GooglePage;
import com.qa.driver.BaseInit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Search {

    private GooglePage googlePage=new GooglePage(BaseInit.getDriver());
    @Given("I have to search companyName via google")
    public void navigateToGoogle() {
        BaseInit.getDriver().get("http://www.google.com");
        Assert.assertEquals("Sign in",googlePage.checkForGoogle());
        System.out.println(googlePage.checkForGoogle());
    }
    @When("I enter the {string} in the search field")
    public void SearchByCompanyName(String companyName) {
        googlePage.searchBy(companyName);
        System.out.println("when "+companyName);
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("validate the company logo")
    public void validateCompanyName() {
        Assert.assertEquals("J.P. MORGAN",googlePage.returnCompanyLogo());

        // Write code here that turns the phrase above into concrete actions

    }



}
