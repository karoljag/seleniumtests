package first.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedSuperSimple {
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("Parameterized value is : " + myName);
    }
}
