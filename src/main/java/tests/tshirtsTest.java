package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.homePage;
import pages.tshirtsPage;

public class tshirtsTest extends baseTest {

    @Test
    public void tshirtTest() throws InterruptedException {
        homePage hp = new homePage(driver);
        hp.goToHomePage();
        tshirtsPage tp = hp.goToTshirtPages();
        System.out.println("Hizo click en t-shirt");
        tp.clickCheckoutM();
        System.out.println("Hizo click en checkout M");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,700);");

        tp.clickAddToCart();

        System.out.println("Todo ok");

        Thread.sleep(4000);
    }
}
