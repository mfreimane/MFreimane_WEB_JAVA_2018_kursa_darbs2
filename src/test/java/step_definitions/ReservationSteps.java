package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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

    @And("^I set FIRST class tickets$")
    public void iSetFIRSTClassTickets() throws InterruptedException {
        test.getReservationPage().selectFirstClassTickets();
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
