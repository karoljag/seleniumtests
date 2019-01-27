import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.badges.Home;
import pageobjects.badges.Login;
import pageobjects.badges.Logout;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 31.10.17.
 */
public class BadgesTests {
    private WebDriver driver;
    private Login login;
   public ReadPropertyFile r;

    @BeforeTest
    public void setup() throws Exception {
        System.setProperty("webdriver.gecko.driver", "badges/executables/geckodriver");
       // System.setProperty("webdriver.edge.driver","executables/MicrosoftWebDriver.exe");
      //  javapumped\badges\executables\MicrosoftWebDriver.exe
        System.setProperty("webdriver.chrome.driver", "executables/chromedriver.exe");
        driver = new ChromeDriver();
         r=new ReadPropertyFile();
        System.out.println(r.getUrl());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(r.getUrl());
        

    }

    @Test
    @Parameters({"username","password"})
    public void login1(String username, String password){
        login = new Login(driver);
        Home home = login.loginToHome(username,password);
        home.checkSuccessfullLogin();
        Logout logout = home.logout();
        Assert.assertTrue(logout.we);
        Assert.assertTrue(true);



    }

    @Test
    public void properties(){
        System.out.println("property"+System.getProperty("${myproperty}"));
        System.getProperty("myproperty");
                Assert.assertTrue(true);


            }


    @AfterTest
    public void quit() {
        driver.quit();
    }


}


//https://www.youtube.com/watch?v=8fM7SoWPaCU