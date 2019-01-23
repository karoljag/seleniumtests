import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.toolsQA.HomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 21.07.18.
 */
public class ToolsQATests {


    private final static String URL = "https://www.toolsqa.com/";
    private WebDriver driver;
    private HomePage homePage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "executables/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public void check() {
        homePage = new HomePage(driver);
        homePage.checkPageIsReady();
        Assert.assertEquals(driver.getCurrentUrl(), URL);
    }

    @AfterTest
    public void close() {
        if (driver != null) driver.quit();
    }

}
