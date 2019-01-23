package pageobjects.badges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

/**
 * Created by karol on 31.10.17.
 */
public class Logout extends BasePage {

    @FindBy(id = "username")
    WebElement inptEmailAddress;

    public Logout(WebDriver driver) {
        super(driver);
    }


     public Boolean we = super.verifyDisplay(inptEmailAddress);


}
