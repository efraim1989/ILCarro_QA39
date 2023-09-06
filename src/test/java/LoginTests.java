import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test

    public void loginPositiveTest() {

        openLoginForm();
        fillLoginForm("edpunk@bk.com", "Nikonddddddddd12345!!!!!");
        submitLogin();
        pause(3000);
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(text(),'success')]")));

        onBtnOk(By.xpath("//button[@type='button']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[.=' Logout ']")));

        logOut();
        Assert.assertTrue(isElementPresent(By.xpath("//*[.=' Log in ']")));

        tearDown();
    }



}
