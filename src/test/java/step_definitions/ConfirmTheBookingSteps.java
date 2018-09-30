package step_definitions;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import general.TestContext;
import cucumber.api.java.en.And;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmTheBookingSteps {

    private TestContext test;

    public ConfirmTheBookingSteps(TestContext testContext){ this.test = testContext;}





            @And("^I confirm the booking$")
    public void iConfirmTheBooking() throws InterruptedException {
        test.getConfirmTheBooking().selectConfirmButton();
        Thread.sleep(1000);
    }


    @And("^I enter first name in personal details form$")
    public void iEnterFirstNameInPersonalDetailsForm() throws InterruptedException {
        test.getConfirmTheBooking().enterFirstNameInPersonalDetailsForm(test.getUser().getFirstName());
//        Thread.sleep(3000);
    }

    @And("^I enter last name in personal details form$")
    public void iEnterLastNameInPersonalDetailsForm() throws InterruptedException {
        test.getConfirmTheBooking().enterLastNameInPersonalDetailsForm(test.getUser().getLastName());
//        Thread.sleep(3000);
    }

    @And("^I enter email address in personal details form$")
    public void iEnterEmailAddressInPersonalDetailsForm() throws InterruptedException {
       test.getConfirmTheBooking().enterEmailAdressInPersonalDetailsForm(test.getUser().getEmailAddress());
//        Thread.sleep(3000);
    }

    @And("^I confirm email address in personal details form$")
    public void iConfirmEmailAddressInPersonalDetailsForm() throws InterruptedException {
        test.getConfirmTheBooking().enterConfirmEmailAdressInPersonalDetailsForm(test.getUser().getEmailAddress());
//        Thread.sleep(3000);
    }

    @And("^I enter mobile phone number in personal details form$")
    public void iEnterMobilePhoneNumberInPersonalDetailsForm() throws InterruptedException {
        test.getConfirmTheBooking().enterMobilePhoneNUmberInPersonDetailsForm(test.getUser().getMobileNumber());
//        Thread.sleep(3000);
    }

    @And("^I enter home address in personal details form$")
    public void iEnterHomeAddressInPersonalDetailsForm() throws InterruptedException {
        test.getConfirmTheBooking().enterHomeAddressInPersonalDetailsForm(test.getUser().getHomeAdress());
//        Thread.sleep(3000);
    }

    @And("^I set country to \"([^\"]*)\" in personal details form$")
    public void iSetCountryToInPersonalDetailsForm(String country) throws InterruptedException {
        test.getConfirmTheBooking().enterCountryInPersonalDetailsForm(country);
        Thread.sleep(3000);
    }
}
