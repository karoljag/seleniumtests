import org.openqa.selenium.WebDriver;

/**
 * Created by karol on 05.08.18.
 */
public class Home extends Base {
    public String url = "http://demoqa.com/";

    public Home(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        System.out.println("http://demoqa.com/");
    }

}
