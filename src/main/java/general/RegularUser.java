package general;

import lombok.Data;

import static utils.RandomGenerator.generateRandomString;

@Data
public class RegularUser {

    private String emailAddress;
    private String password;

    public RegularUser() {
        this.emailAddress = "test@qa.com";
        this.password = "asdfgh";
    }

}
