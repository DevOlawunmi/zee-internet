package co.uk.theinternet.stepDefinitions;

import co.uk.theinternet.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BasePage {

    @Given("I navigate to the-internet.herokuapp.com")
public void i_navigate_to_the_internet_herokuapp_com() {
launchURL();
}

    @When("I click on the {string}")
    public void i_click_on_the(String string) {

    }

    @Then("the {string} is displayed")
    public void the_is_displayed(String string) {

    }

    @Then("I click the link to trigger a redirection")
    public void i_click_the_link_to_trigger_a_redirection() {

    }

}
