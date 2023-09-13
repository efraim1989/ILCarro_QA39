package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public interface HelperUser extends HelperBase {



    default void openLoginForm(){
        wd.findElement(By.xpath("//*[.=' Log in ']")).click();
    }
    default void openRegistrationForm(){
        wd.findElement(By.xpath("//*[.=' Sign up ']")).click();
    }

    default void fillLoginForm(User user){

        type(By.xpath("//*[@id='email']"), user.getEmail());
        type(By.xpath("//*[@id='password']"), user.getPassword());

    }
    default void fillLoginForm(String email, String password){

        type(By.xpath("//*[@id='email']"), email);
        type(By.xpath("//*[@id='password']"), password);

    }
    default void fillRegistrationForm(User user){

        type(By.xpath("//*[@id='name']"), user.getName());
        type(By.xpath("//*[@id='lastName']"), user.getLastName());
        type(By.xpath("//*[@id='email']"), user.getEmail());
        type(By.xpath("//*[@id='password']"), user.getPassword());
        clickCheckBox();


    }

    default void clickCheckBox(){
        //variant1
//        click(By.xpath("//label[@for='terms-of-use']"));

        //variant2

        JavascriptExecutor js = (JavascriptExecutor)wd;
        js.executeScript("document.querySelector('#terms-of-use').click();");

    }

    default void submitLogin(){

        wd.findElement(By.xpath("//*[@type='submit']")).click();

    }
    default void submitRegistration(){

        wd.findElement(By.xpath("//*[@type='submit']")).click();

    }

    default Boolean isLoggedSuccess(){
        return isElementPresent(By.xpath("//h2[contains(text(),'success')]"));

    }

    default boolean isLogged(){
        return isElementPresent
                (By.xpath("//a[.=' Logout ']"));
    }

    default void logOut(){
        click(By.xpath("//a[.=' Logout ']"));

    }

    default void onBtnOk(){
        click(By.xpath("//button[@type='button']"));
    }

    default void login(User user){
        openLoginForm();
        fillLoginForm(user);
        submitLogin();
        onBtnOk();
    }



}
