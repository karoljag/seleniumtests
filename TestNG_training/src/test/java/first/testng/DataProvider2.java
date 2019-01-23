package first.testng;

import main.testng.EvenNumberChecker;
import main.testng.PrimeNumberChecker;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
    private EvenNumberChecker evenNumberChecker;

    @BeforeTest
    public void initialize() {
        evenNumberChecker = new EvenNumberChecker();
    }

    @DataProvider(name = "number")
    public Object[][] provideData() {
        return new Object[][]{{1}, {2}, {28}, {110}, {365}, {400}, {800}};
    }


    @Test(dataProvider = "number")
    public void checkMe(Integer n) {
        evenNumberChecker.check(n);
        System.out.println(n);
    }

}


