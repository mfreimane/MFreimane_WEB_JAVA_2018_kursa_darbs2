package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;

public class LoginSteps {

    private TestContext test;

    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I enter a regular User email$")
    public void iEnterARegularUserEmail() {
        test.getLoginPage().enterRegularUserEmail(test.getRegularUser().getEmailAddress());
    }

    @And("^I enter a regular User password$")
    public void iEnterARegularUserPassword() throws InterruptedException {
//        Thread.sleep(1000);
        test.getLoginPage().enterRegularUserPassword(test.getUser().getPassword());
    }

    @And("^I select login button in Login form$")
    public void iSelectLoginButtonInLoginForm() throws InterruptedException {
        Thread.sleep(1000);
        test.getLoginPage().selectLoginButtonInLoginForm();
    }

    @And("^I enter a User email$")
    public void iEnterAUserEmail() throws InterruptedException {
        test.getLoginPage().enterEmailAddress(test.getUser().getEmailAddress());
        Thread.sleep(1000);
    }

    @And("^I enter a User password$")
    public void iEnterAUserPassword() {
        test.getLoginPage().enterUserPassword(test.getUser().getPassword());
    }

    @When("^I login this account$")
    public void iLoginThisAccount() throws Throwable {
        iEnterAUserEmail();
        iEnterAUserPassword();
        iSelectLoginButtonInLoginForm();

    }
}
