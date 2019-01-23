package first.testng;

import main.testng.ExceptionHandling;
import org.testng.annotations.Test;

public class ExceptionHandlingTest {
    private Integer k = 3;


    ExceptionHandling exept = new ExceptionHandling(k);


    @Test(expectedExceptions = ArithmeticException.class)

    public void helloExeption() {
        System.out.println("print");
        exept.divideByZero();
    }

    @Test
    public void printSmth(){
        System.out.println("SMTH");

    }


}
