package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

public class SignUpSteps {

    TestContext test;

    public SignUpSteps(TestContext testContext){
        this.test = testContext;

    }
    @And("^I enter First name$")
    public void iEnterFirstName() {
        test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
    }


    @And("^I enter Last name$")
    public void iEnterLastName() {
        test.getSignUpPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() {
        test.getSignUpPage().enterMobilePhoneNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        test.getSignUpPage().enterEmailAddress(test.getUser().getEmailAddress());
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I confirm password$")
    public void iConfirmPassword() {
        test.getSignUpPage().enterConfirmationPassword(test.getUser().getPassword());
    }

    @And("^I select sign up button in SignUp page$")
    public void iSelectSignUpButtonInSignUpPage() {
        test.getSignUpPage().selectSignUpButton();
    }

    @And("^I have created new account$")
    public void iHaveCreatedNewAccount() {
            iEnterFirstName();
            iEnterLastName();
            iEnterMobilePhoneNumber();
            iEnterEmailAddress();
            iEnterPassword();
            iConfirmPassword();
            iSelectSignUpButtonInSignUpPage();
    }
}
