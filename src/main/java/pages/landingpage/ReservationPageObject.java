package pages.landingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReservationPageObject {

    private SelenideElement getFlightsMenuButton() { return $(By.xpath("//li/a/descendant::span[contains(text(), 'Flights')]"));}

    private SelenideElement getRoundTripCheckbox() { return $(By.xpath("//div[@class='iradio_square-grey']"));}

    private SelenideElement getFirstClassTicketButton() { return $(By.xpath("//select[@name='cabinclass']/option[contains(., 'First')]"));}

//    private SelenideElement getRigaAirportAsDeparture() { return }
    private SelenideElement getEnterCityOrAirportField() { return $("#s2id_location_from > a");}

    private SelenideElement getMuchfieldForDepartureAirport() { return $("#select2-drop > ul > li.select2-results-dept-0.select2-result.select2-result-selectable.select2-highlighted > div > span");}

    private SelenideElement getArrivalAirportField() { return $("#s2id_location_to > a");}

    private SelenideElement getMuchfieldForArrivialAirport() { return $("#select2-drop > ul > li > div");}

    private SelenideElement getDepartureDateField() { return $("#flights > form > div:nth-child(3) > div > input");}

    private SelenideElement getReturnDateField() { return $("#flights > form > div:nth-child(4) > div > input");}

    private SelenideElement getPersonField() { return $("#flights > form > div.col-md-1.form-group.go-right.col-xs-12 > div > input");}

    private SelenideElement getAdultPersonField() { return $("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(1) > div.col-sm-5.col-xs-5 > select");}

    private SelenideElement getTwoAdultPersonField() { return $("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(1) > div.col-sm-5.col-xs-5 > select > option:nth-child(2)");}


    public void selectFlightsMenuInBookingSection() {
        getFlightsMenuButton().click();
    }

    public void selectRoundsTripFlightOption() {
        getRoundTripCheckbox().click();
    }

    public void selectFirstClassTickets() {
        getFirstClassTicketButton().click();
    }

    public void setDepartureAirport(String departure) {
        getEnterCityOrAirportField().click();
        getEnterCityOrAirportField().sendKeys(departure);
        getMuchfieldForDepartureAirport().click();
    }

    public void setArrivalAirport(String arrivial) {
        getArrivalAirportField().click();
        getArrivalAirportField().sendKeys(arrivial);
        getMuchfieldForArrivialAirport().click();
    }

    public void setDepartureDate(String departureDate) {
        getDepartureDateField().click();
        getDepartureDateField().sendKeys(departureDate);
    }

    public void setReturnDate(String returnDate) {
        getReturnDateField().click();
        getReturnDateField().sendKeys(returnDate);
    }

    public void setAdultPerson() {
        getPersonField().click();
        getAdultPersonField().click();
        getTwoAdultPersonField().click();
    }

}


//a[@href='#flights']
////select[@name='cabinclass']/option[contains(., 'First')]
////div[@id='select2-drop']
//setArrivalAirport