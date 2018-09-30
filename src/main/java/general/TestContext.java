package general;


import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.landingpage.ConfirmTheBookingPageObject;
import pages.landingpage.ReservationPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

@Data
public class TestContext {

    private User user;
    private RegularUser regularUser;
    private AccountPageObject accountPage;
    private NavigationPageObject navigationPage;
    private ReservationPageObject reservationPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;
    private Booking booking;
    private ConfirmTheBookingPageObject ConfirmTheBooking;

    public TestContext() {
        this.user = new User();
        this.regularUser = new RegularUser();
        this.accountPage = new AccountPageObject();
        this.navigationPage = new NavigationPageObject();
        this.reservationPage = new ReservationPageObject();
        this.loginPage = new LoginPageObject();
        this.signUpPage = new SignUpPageObject();
        this.booking = new Booking();
        this.ConfirmTheBooking = new ConfirmTheBookingPageObject();
    }


}
