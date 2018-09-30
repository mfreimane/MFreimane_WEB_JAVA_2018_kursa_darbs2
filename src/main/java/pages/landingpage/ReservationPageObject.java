package pages.landingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import java.nio.channels.SelectableChannel;

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

    private SelenideElement getChildPersonField() { return $("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(2) > div.col-sm-5.col-xs-5 > select");}

    private SelenideElement gettwoChildPersonField() { return $("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(2) > div.col-sm-5.col-xs-5 > select > option:nth-child(3)");}

    private SelenideElement getInfantPersonField() { return $("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(3) > div.col-sm-5.col-xs-5 > select");}

    private SelenideElement getOneInfantPersonField() { return $("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(3) > div.col-sm-5.col-xs-5 > select > option:nth-child(2)");}

    private SelenideElement getCrossButtonFieldInGuestsPopup() { return $( "#manual_flightTravelers > div > div > div.modal-header > button");}

    private SelenideElement getDoneButtonFieldInGuestsPopup() { return $( "#sumManualPassenger");}

    private SelenideElement getSearchButton() { return $( "#flights > form > div.bgfade.col-md-1.col-xs-12.search-button > button");}

    private SelenideElement getBusinessClassTicketButton() { return $(By.xpath("//select[@name='cabinclass']/option[contains(., 'Business')]"));}

    private SelenideElement getBookNowButton() { return $("#bookbtn");}

    private SelenideElement getNumberOfAdults(String numberOfAdults) { return $(By.xpath("//select[@name='madult']/option[contains(., '" + numberOfAdults + "')]"));}

    private SelenideElement getNumberOfChildrens(String numberOfChildrens) { return $(By.xpath("//select[@name='mchildren']/option[contains(., '" + numberOfChildrens + "')]"));}

    private SelenideElement getNumberOfInfants(String numberOfInfants) { return $(By.xpath("//select[@name='minfant']/option[contains(., '" + numberOfInfants + "')]"));}





    public void selectFlightsMenuInBookingSection() {
        getFlightsMenuButton().click();
    }

    public void selectRoundsTripFlightOption() {
        getRoundTripCheckbox().click();
    }

    public void selectBusinessClassTickets() {
        getBusinessClassTicketButton().click();
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

    public void setChildPerson() {
        getChildPersonField().click();
        gettwoChildPersonField().click();

    }

    public void setInfantPerson() {
        getInfantPersonField().click();
        getOneInfantPersonField().click();
        getDoneButtonFieldInGuestsPopup().click();
    }

    public void selectSearcheButton() {
        getSearchButton().click();
    }

    public void selectBookNowButton() {
        getBookNowButton().click();
    }


    public void setNumberOfAdults(String numberOfAdults) {
        getPersonField().click();
        getNumberOfAdults(numberOfAdults).click();
    }

    public void setNumberofChildrens(String getNumberOfChildrens) {
        getNumberOfChildrens(getNumberOfChildrens).click();
    }

    public void setNumberofInfants(String getNumberOfInfants) {
        getNumberOfInfants(getNumberOfInfants).click();
        getDoneButtonFieldInGuestsPopup().click();
    }
}


//a[@href='#flights']
////select[@name='cabinclass']/option[contains(., 'First')]
////div[@id='select2-drop']
//setArrivalAirport
//private SelenideElement getFlightsOptionRadioBox(String option) {
//        return $(By.xpath("//div[@class='pure-checkbox'][./label[contains(text(), '" + option + "')]]/div[contains(@class, 'iradio_square-grey')]"));
//    }
//