import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase  {

    @BeforeMethod
    public void precondition(){
        if (isLogged()) logOut();
    }

    @Test

    public void loginPositiveTest() {

        openLoginForm();
        fillLoginForm("edpunk@bk.com", "Nikonddddddddd12345!!!!!");
        submitLogin();
        pause(3000);
        Assert.assertTrue(isLoggedSuccess());
        onBtnOk();

    }
    @Test
    public void loginPositiveTestModel() {

        User user = new User()
                .withEmail("edpunk@bk.com")
                .withPassword("Nikonddddddddd12345!!!!!");

        openLoginForm();

        fillLoginForm(user);

        pause(5000);
        submitLogin();

        Assert.assertTrue(isLoggedSuccess());
        onBtnOk();

    }



}
