package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNamefield() {
        return $("input[name='firstname']");
    }
    private SelenideElement getLasttNamefield() {
        return $("input[name='lastname']");
    }
    private SelenideElement getMobileNumberfield() {
        return $("input[name='phone']");
    }
    private SelenideElement getEmailfield() {
        return $("input[name='email']");
    }
    private SelenideElement getPasswordfield() {
        return $("input[name='password']");
    }
    private SelenideElement getConfirmPasswordfield() {
        return $("input[name='confirmpassword']");
    }
    private SelenideElement getSignUpButton() {
        return $(".btn-lg");
    }


    public void enterFirstName(String firstname) {
        getFirstNamefield().sendKeys(firstname);
    }
    public void enterLastName(String lastname) {
        getLasttNamefield().sendKeys(lastname);
    }
    public void enterMobilePhoneNumber(String mobile_number) {
        getMobileNumberfield().sendKeys(mobile_number);
    }
    public void enterEmailAddress(String email) {
        getEmailfield().sendKeys(email);
    }
    public void enterPassword(String password) {
        getPasswordfield().sendKeys(password);
    }
    public void enterConfirmationPassword(String password) {
        getConfirmPasswordfield().sendKeys(password);
    }
    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }

}
