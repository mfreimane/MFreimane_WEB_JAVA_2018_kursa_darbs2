package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

public class ReservationSteps {

    private TestContext test;

    public ReservationSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select FLIGHTS menu in booking section$")
    public void iSelectFlightsMenuInBookingSection() throws InterruptedException {
        test.getReservationPage().selectFlightsMenuInBookingSection();
        Thread.sleep(1000);
    }

    @And("^I select ROUND TRIP flight option$")
    public void iSelectROUNDTRIPFlightOption() {
        test.getReservationPage().selectRoundsTripFlightOption();
    }

    @And("^I set BUSINESS class tickets$")
    public void iSetBUSINESSClassTickets() throws InterruptedException {
        test.getReservationPage().selectBusinessClassTickets();
//        Thread.sleep(3000);
    }

    @And("^I set \"([^\"]*)\" as departure airport$")
    public void iSetAsDepartureAirport(String departure) throws InterruptedException {
        test.getReservationPage().setDepartureAirport(departure);
        Thread.sleep(1000);
    }

    @And("^I set \"([^\"]*)\" as arrival airport$")
    public void iSetAsArrivalAirport(String arrival) throws InterruptedException {
        test.getReservationPage().setArrivalAirport(arrival);
        Thread.sleep(1000);
    }

    @And("^I set \"([^\"]*)\" as departure date$")
    public void iSetAsDepartureDate(String departureDate) throws InterruptedException {
        test.getReservationPage().setDepartureDate(departureDate);
//        Thread.sleep(3000);
    }

    @And("^I set \"([^\"]*)\" as the return date$")
    public void iSetAsTheReturnDate(String returnDate) throws InterruptedException {
        test.getReservationPage().setReturnDate(returnDate);
//        Thread.sleep(3000);
    }

    @And("^I set two adults$")
    public void iSetTwoAdults() throws InterruptedException {
        test.getReservationPage().setAdultPerson();
//        Thread.sleep(3000);
    }

    @And("^I set two children$")
    public void iSetTwoChildren() throws InterruptedException {
        test.getReservationPage().setChildPerson();
//        Thread.sleep(3000);
    }

    @And("^I set one infant$")
    public void iSetOneInfant() throws InterruptedException {
       test.getReservationPage().setInfantPerson();
//        Thread.sleep(3000);
    }

    @And("^I search for a flight$")
    public void iSearchForAFlight() throws InterruptedException {
        test.getReservationPage().selectSearcheButton();
//        Thread.sleep(3000);
    }

    @And("^I book the first flight offer available$")
    public void iBookTheFirstFlightOfferAvailable() throws InterruptedException {
        test.getReservationPage().selectBookNowButton();
//        Thread.sleep(3000);
    }

    @And("^I set \"([^\"]*)\" adults$")
    public void iSetAdults(String numberOfAdults) throws InterruptedException {
        test.getReservationPage().setNumberOfAdults(numberOfAdults);
//        Thread.sleep(3000);
    }

    @And("^I set \"([^\"]*)\" children$")
    public void iSetChildren(String NumberOfChildrens) throws InterruptedException {
        test.getReservationPage().setNumberofChildrens(NumberOfChildrens);
//        Thread.sleep(3000);
    }

    @And("^I set \"([^\"]*)\" infant$")
    public void iSetInfant(String NumberOfInfants) throws InterruptedException {
        test.getReservationPage().setNumberofInfants(NumberOfInfants);
//        Thread.sleep(3000);
    }

    @Then("^I invoice details contain correct data$")
    public void iInvoiceDetailsContainCorrectData() throws InterruptedException {

        Thread.sleep(3000);
    }


//    @And("^I set \"([^\"]*)\" adults$")
//    public void iSetAdults(String Adults) throws InterruptedException {
//        test.getReservationPage().setAdultPerson(Adults);
//        //Thread.sleep(3000);
//    }


//    @And("^I set \"(.*?)\" as departure airport$")
//    public void iSetRIGAAsDepartureAirport()  throws InterruptedException  {
//        test.getReservationPage().setRigaAsDepartureAirport(test.getBooking().toString());
//        Thread.sleep(1000);
//    }


}
