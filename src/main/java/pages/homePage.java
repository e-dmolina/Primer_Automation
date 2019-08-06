package pages;

import bsh.Variable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homePage extends basePage{

    //Constructor
    public homePage(WebDriver driver){
        super(driver);
    }

    //Variables
    //String baseURL = "https://www.google.com";
    String baseURL = "http://automationpractice.com";

    //Locators
    By logInLink = By.xpath("//a[contains(text(),'Sign in')]");
    By pageLogo = By.xpath("//img[@alt='My Store']");
    By tshirtLink = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");

    //Methods
    public homePage goToHomePage(){
        driver.get(baseURL);
        return this;
    }

    public loginPage goToLoginPage() throws InterruptedException {
        click(logInLink);
        return new loginPage(driver);
    }

    public tshirtsPage goToTshirtPages() throws InterruptedException{
        click(tshirtLink);
        return new tshirtsPage(driver);
    }
}
