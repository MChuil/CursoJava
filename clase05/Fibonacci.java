package clase05;

public class Fibonacci {
    
    public static void main(String[] args){
        System.out.println("EL fibonacci de 15 es: " + fib(15));
    }

    static int fib(int n){
        if(n < 2){
            return n;
        }else{
            return fib(n-1) + fib(n-2); 
            /*
             * (10-1) + (10-2)
             * (9-1) + (8-2)
             * (8-1) + (6-2)
             * (7-1) + (4-2)
             * (6-1) + (2-2)
             */
        }
    }
}
