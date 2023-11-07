import manager.HelperCar;
import manager.HelperUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestBase implements HelperUser, HelperCar {

    WebDriver wd;

        @BeforeSuite
//        public void init() {
//        wd = new ChromeDriver();
//        wd.navigate().to("https://ilcarro.web.app/search");
//        wd.manage().window().maximize();
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        }
        public void setup() throws IOException {
            init();

        }

        @AfterSuite
        public void stop(){
            tearDown();
        }


















}
