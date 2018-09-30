package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;

public class HomePageSteps {

    private TestContext test;

    public HomePageSteps(TestContext testContext){
        this.test = testContext;
    }

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() {
        System.out.println("Navigation is visible");
    }

    @When("^I select My Account button$")
    public void iSelectMyAccountButton() {
        test.getNavigationPage().selectMyAccountButton();
    }

    @And("^I select sign up button$")
    public void iSelectSignUpButton() {
        test.getNavigationPage().selectSignUpButton();
    }

    @When("^I am in Signup form$")
    public void iAmInSignUpForm() throws Throwable {
//        iHaveOpenedHomepage();
        iSelectMyAccountButton();
        iSelectSignUpButton();
    }

    @And("^I navigate to Home page$")
    public void iNavigateToHomePage() throws Throwable {
        Thread.sleep(1000);
        test.getNavigationPage().selectHomeButton();
        Thread.sleep(1000);
    }
}
