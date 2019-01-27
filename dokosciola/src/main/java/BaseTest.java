import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest extends DriverSetup {
    //   WebDriver wd;
    @BeforeTest
    public void setup() throws Exception {
        setupAll();
        wd.get("http://dokosciola.pl");
    }

    @Test
    public void t1(){
        Assert.assertTrue(true);
    }


    @AfterTest
    public void quit(){
        quitDriver();
    }
}
