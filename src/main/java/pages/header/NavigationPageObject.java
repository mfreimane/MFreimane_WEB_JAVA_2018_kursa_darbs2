package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;
import pages.landingpage.ReservationPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $(By.xpath("//nav/descendant::li[@id='li_myaccount']/a"));
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Login')]"));
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Sign Up')]"));
    }
    private SelenideElement getUserAccountButton(String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(), '" + username + "')]"));
    }
    private SelenideElement getLogoutButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Logout')]"));
    }
    private SelenideElement getHomeButton() { return $(By.xpath("//a[@href='https://www.phptravels.net/']"));}


    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }
    public void selectLoginButton() {
        getLoginButton().click();
    }
    public void selectSignUpButton() {
        getSignUpButton().click();
    }
    public AccountPageObject selectUserAccountButton(String username) {
        getUserAccountButton(username).click();
        return page(AccountPageObject.class);
    }
    public ReservationPageObject selectLogoutButton() {
        getLogoutButton().click();
        return page(ReservationPageObject.class);
    }
    public  void selectHomeButton() {
        getHomeButton().click();
    }

}
