package first.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrized {
    @Parameters({"myName", "myPass"})
    @Test
    public void MyNameMyPass(String aa, String bb) {
        System.out.println("A: " + aa + "    B: " + bb);
    }

    @Parameters({"param1", "param2"})
    @Test
    public void wypisz(String aa, String bb) {
        System.out.println("A: " + aa + "    B: " + bb);
    }

    @Parameters({"paramX"})
    @Test
    public void wypisz(String x) {
        System.out.println("ParametrIKS: " + x);
    }



}


