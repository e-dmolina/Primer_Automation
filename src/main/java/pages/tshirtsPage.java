package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tshirtsPage extends basePage {

    public tshirtsPage(WebDriver driver) {
        super(driver);
    }

    By checkoutM = By.xpath("//*[@id=\"layered_id_attribute_group_2\"]");
    WebElement addToCart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span"));
    WebElement imagen = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));

    public void clickCheckoutM(){
        //waitVisibility(elementBy);
        click(checkoutM);
    }

    public descriptionPage clickAddToCart(){
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("scroll(0,700);");
        Actions accion = new Actions(driver);
        accion.moveToElement(imagen).moveToElement(addToCart).click().build().perform();

        return new descriptionPage(driver);
    }


}
