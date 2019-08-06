import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.homePage;
import pages.loginPage;


public class SimpleTest {

    public static void main (String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/home/ariel/POC/chromedriver");
        //WebDriver driver = new ChromeDriver();
        String baseURL = "http://automationpractice.com";
        System.setProperty("webdriver.gecko.driver", "C:\\JavaAutomationJars\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("diegomolina1983@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(5000);

        //driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
