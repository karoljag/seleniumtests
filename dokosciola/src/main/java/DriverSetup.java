import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class DriverSetup {
    // public static WebDriver webDriver;
    public static WebDriver wd;
    public   WebDriverStartupInfo startupInfo;
    public DriverSetup() {
        startupInfo = new WebDriverStartupInfo("firefox");
    }

//    public static WebDriver getDriver(WebDriver wd) {
//        ////////
//
//        return wd;
//    }


    public  WebDriver initRemoteWebdriver(WebDriverStartupInfo wbs) {


        System.setProperty("webdriver.chrome.driver", "executables/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "executables/geckodriver.exe");
        switch (wbs.browserType) {
            case "firefox":
                wd = new FirefoxDriver();
                break;
            case "chrome":
                wd = new ChromeDriver();
                break;
            default:
                wd = new ChromeDriver();

        }
        return wd;
    }

    public WebDriver getDriver() {
        if (wd == null) {
            initRemoteWebdriver(startupInfo);
            wd.manage().window().maximize();
        }
        return wd;
    }

    public void quitDriver() {
        if (null != wd) {
            wd.quit();
            wd = null;
        }
    }

    public void setupAll(){
        DriverSetup ds = new DriverSetup();
        getDriver();
    }
}