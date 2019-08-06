package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.*;

import static org.testng.Assert.assertEquals;


public class loginPage extends basePage {

    //Constructor
    public loginPage(WebDriver driver){
        super(driver);
    }

    //Locators
    By usernameInput = By.id("diegomolina1983@gmail.com");
    By passwordInpunt = By.id("123456");
    By logInButton = By.xpath("//button[@id='SubmitLogin']/span");
    By userNameErrorText = null; //COMPLETAR
    By passwordErrorText = null; //COMPLETAR


}
