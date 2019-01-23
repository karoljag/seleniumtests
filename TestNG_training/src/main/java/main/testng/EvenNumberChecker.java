package main.testng;

public class EvenNumberChecker {

    public void check( Integer n){
        if (n%2 ==0){
        System.out.println("Mamy PARZYSTA: "+n);
    }
    else {
            System.out.println("Mamy NIEparzysta: "+n);
        }
    }

}
