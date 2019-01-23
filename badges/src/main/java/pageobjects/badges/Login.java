package pageobjects.badges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

/**
 * Created by karol on 31.10.17.
 */
public class Login extends BasePage {
    @FindBy(id = "username")
    WebElement inptEmailAddress;

    @FindBy(id = "password")
    WebElement inptPassword;

    @FindBy(xpath = "//*[@id='casLoginForm']/div/div[3]/div[4]/div/div/button")
    WebElement btnSignIn;

    public Login(WebDriver driver) {
        super(driver);
    }

    public Home loginToHome(String username, String password) {
        inptEmailAddress.sendKeys(username);
        inptPassword.sendKeys(password);
        btnSignIn.click();
        return new Home(driver);
    }

}
