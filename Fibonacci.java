package Clase5;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));  
    }

    static int fibonacci( int n ){
        n = 2;
        if (n < 2) {
            return n;    
        }else{
            return fibonacci( n - 1 ) + fibonacci( n - 2);
        }    
    }
}