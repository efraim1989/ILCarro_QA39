import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

        @BeforeMethod
        public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro.web.app/search");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

        @AfterMethod
    public void tearDown(){
        pause(3000);
        wd.quit();
    }

        public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

        public boolean isAlertPresent(){
        Alert alert = new WebDriverWait(wd, 5)
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) return false;
        wd.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        return true;
    }

        public boolean isElementPresent(By locator){
      return   wd.findElements(locator).size()>0;
    }

////////////////////////////////////////////////////////////////////////////////////

    public void openLoginForm(){
        wd.findElement(By.xpath("//*[.=' Log in ']")).click();
    }

        public void fillLoginForm(String email, String password){

        type(By.xpath("//*[@id='email']"), email);
        type(By.xpath("//*[@id='password']"), password);

    }

        public void submitLogin(){

        wd.findElement(By.xpath("//*[@type='submit']")).click();

    }

        public void click(By locator){
            wd.findElement(locator).click();
        }

        public void type(By locator, String text){
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }

        public void onBtnOk(By locator){
            wd.findElement(locator).click();
        }

        public void logOut(){
            click(By.xpath("//a[.=' Logout ']"));
        }
















}
