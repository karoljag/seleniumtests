package pageobjects.wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

/**
 * Created by karol on 23.10.17.
 */
public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id='pt-login']/a")
    private WebElement lnkZaloguj;

    @FindBy(id ="wpName1")
    private WebElement inputUsername;

    @FindBy(id="wpPassword1")
    private WebElement inputPassword;

    @FindBy(id="wpLoginAttempt")
    private WebElement btnZaloguj;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage LoginToHomePage(String username,String pass){
        lnkZaloguj.click();
        inputPassword.clear();
        inputUsername.sendKeys(username);
        inputPassword.clear();
        inputPassword.sendKeys(pass);
        btnZaloguj.click();
        return new HomePage(driver);
    }


}
