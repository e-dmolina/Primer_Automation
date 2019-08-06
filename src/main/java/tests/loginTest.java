package tests;

import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;

public class loginTest extends baseTest {

    @Test
    public void logInUserAndPassword() throws InterruptedException {
        homePage hp = new homePage(driver);
        hp.goToHomePage();

        hp.goToLoginPage();

    }



}