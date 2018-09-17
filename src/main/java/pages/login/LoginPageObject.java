package pages.login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObject {

    private SelenideElement getEmailfield() {
        return $("input[name = 'username']");
    }

    private SelenideElement getPasswordfield() {
        return $("input[name = 'password']");
    }

    private SelenideElement getLoginButtonInLoginForm() {
        return $(".btn-lg");
    }



    public void enterRegularUserEmail(String email) {
        getEmailfield().sendKeys(email);
    }
    public void enterRegularUserPassword(String password) {
        getPasswordfield().sendKeys(password);
    }
    public void selectLoginButtonInLoginForm() {
        getLoginButtonInLoginForm().click();
    }
    public void enterEmailAddress(String email) {
        getEmailfield().sendKeys(email);
    }
    public void enterUserPassword(String password) {
        getPasswordfield().sendKeys(password);
    }



}
