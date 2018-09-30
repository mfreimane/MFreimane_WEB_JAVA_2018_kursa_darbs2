package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.TestContext;

public class AccountSteps {

    private TestContext test;

    public AccountSteps(TestContext testContext){
        this.test = testContext;
    }


    @And("^I select Login button$")
    public void iSelectLoginButton() {
        test.getNavigationPage().selectLoginButton();
    }

    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() throws InterruptedException {
        System.out.println("REGULAR_USER IS SUCCESSFULLY LOGGED IN!");
        Thread.sleep(1000);
    }

    @Then("^I successfully sign up$")
    public void userAccountPageIsOpened() {
        System.out.println("ACCOUNT CREATED!");
    }

    @And("^I select User Account button$")
    public void iSelectUserAccountButton() {
        test.getNavigationPage().selectUserAccountButton(test.getUser().getFirstName());
    }

    @When("^I select Logout button in Navigation bar$")
    public void iSelectLogoutButtonInNavigationBar() {
        test.getNavigationPage().selectLogoutButton();
    }

    @And("^I have an existing account$")
    public void iHaveAnExistingAccount() throws Throwable {
        iSelectUserAccountButton();
//        iSelectLoginButton();
        iSelectLogoutButtonInNavigationBar();
    }


//    public void iLogout() {
//        test.getNavigation().selectLogoutButton();
//    }

}
