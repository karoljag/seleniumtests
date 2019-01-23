package main.testng;

public class ExceptionHandling {
    private Integer i;

    public ExceptionHandling(Integer j){
        this.i = j;
        }
    public Integer divideByZero(){
        int di  = this.i/0;
        System.out.println(di);
        return di;
    }



}
