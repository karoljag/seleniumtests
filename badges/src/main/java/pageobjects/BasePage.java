package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by karol on 23.10.17.
 */
public class BasePage {
protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    protected Boolean verifyDisplay(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("DISPLAYED6");
            return true;
        }
        else if(element.isEnabled()) {
            System.out.println("ENABLED");
            return true;
        } else {
            System.out.println("BRAK");
            return false;
        }
    }


    public void checkPageIsReady() {

        JavascriptExecutor js = (JavascriptExecutor)driver;


        //Initially bellow given if condition will check ready state of page.
        if (js.executeScript("return document.readyState").toString().equals("complete")){
            System.out.println("Page Is loaded.");
            return;
        }

        //This loop will rotate for 25 times to check If page Is ready after every 1 second.
        //You can replace your value with 25 If you wants to Increase or decrease wait time.
        for (int i=0; i<25; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {}
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")){
                break;
            }
        }
    }



}
