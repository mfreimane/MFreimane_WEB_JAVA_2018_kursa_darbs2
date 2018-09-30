package pages.landingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ConfirmTheBookingPageObject {

    private SelenideElement getConfirmButton() { return $("#body-section > div > div > div.loadinvoice > div > div.col-md-8.offset-0.go-right > div:nth-child(2) > div.form-group > button");}

    private SelenideElement getFirstNamefieldforBooking() {
        return $("#guestform > div:nth-child(1) > div:nth-child(2) > input");
    }
    private SelenideElement getLastNamefieldforBooking() {
        return $("#guestform > div:nth-child(1) > div:nth-child(3) > input");
    }
    private SelenideElement getEmailAdressfieldforBooking() {
        return $("#guestform > div:nth-child(2) > div:nth-child(2) > input");
    }
    private SelenideElement getConfirmEmailAdressfieldforBooking() {
        return $("input.form-control[name=confirmemail]");
    }
    private SelenideElement getMobilePhoneNumberfieldforBooking() {
        return $("input.form-control[name=phone]");
    }
    private SelenideElement getHomeAddressfieldforBooking() {
        return $("input.form-control[name=address]");
    }
    private SelenideElement getCountryfieldforBooking() {
        return $("#s2id_autogen1 > a");
    }
    private SelenideElement getRelevantCountryField(String country) {
        return $(By.xpath("//ul[@class='select2-results']/li/div[contains(., '" + country + "')]"));}

    ////ul[@class='select2-results']/li/div[contains(., "Latvia")]
    //#select2-drop > div > input
    //#s2id_autogen1 > a


    public void enterFirstNameInPersonalDetailsForm(String firstname) {
        getFirstNamefieldforBooking().sendKeys(firstname);
    }
    public void enterLastNameInPersonalDetailsForm(String lastname) {
        getLastNamefieldforBooking().sendKeys(lastname);
    }

    public void enterEmailAdressInPersonalDetailsForm(String emailAdress) {
        getEmailAdressfieldforBooking().sendKeys(emailAdress);
    }

    public void enterConfirmEmailAdressInPersonalDetailsForm(String emailAdress) {
        getConfirmEmailAdressfieldforBooking().sendKeys(emailAdress);
    }

    public void enterMobilePhoneNUmberInPersonDetailsForm(String phoneNumber) {
        getMobilePhoneNumberfieldforBooking().sendKeys(phoneNumber);
    }

    public void enterHomeAddressInPersonalDetailsForm(String homeAddress) {
        getHomeAddressfieldforBooking().sendKeys(homeAddress);
    }
    public void enterCountryInPersonalDetailsForm(String country) {
        getCountryfieldforBooking().click();
        getRelevantCountryField(country).click();
    }

    public void selectConfirmButton() {
        getConfirmButton().click();
    }

}
