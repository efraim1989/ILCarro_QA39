import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCarTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        if (isLogged() == false){
            login(new User()
                            .withEmail("edpunk@bk.com")
                            .withPassword("Nikonddddddddd12345!!!!!")
            );

        }

    }


    @Test
    public void addNewCarPositive(){

        int i = (int) ((System.currentTimeMillis()/1000)%3600);



    }




}


// "edpunk@bk.com", "Nikonddddddddd12345!!!!!"