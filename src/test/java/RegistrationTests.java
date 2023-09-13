import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{



    @Test
    public void registrationPositive(){

        int i = (int) ((System.currentTimeMillis()/1000)%3600);

        User user = new User(
                "Ef",
                "London",
                "ef_" + i + "@mail.com",
                "$Ef12345"
        );

        openRegistrationForm();
        fillRegistrationForm(user);

        submitRegistration();
        pause(5000);
        Assert.assertTrue(isLoggedSuccess());









    }


}
