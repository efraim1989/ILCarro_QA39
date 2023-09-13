package manager;

import org.openqa.selenium.By;

public interface HelperCar  extends HelperBase{

    default void openCarForm(){
        click(By.xpath(""));
    }


}
