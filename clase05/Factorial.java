package clase05;

public class Factorial {
    
    public static void main(String[] args){

        System.err.println(factorial(8));
        /*
        *      Factorial
        *      
        *      Forma Iterativa
        *      8! = 8x7x6x5x4x3x2x1 = 40320
        *      5! = 5x4x3x2x1 = 120
        * 
        *      Forma recursiva
        *      8! = 8x7!
        *      5! = 5x4!
        */
        // int fac = 5;
        // int num = 4;
        // int result = 0;
        // do{
        //     if(result>0){
        //         result = result * num; //120*1 =120
        //     }else{
        //         result = fac * num; //5*4 =20
        //     }
        //     num = num - 1; //1-1 = 0
        // }while(num > 0);
        // System.out.println("El factorial de " + fac + " es: " + result);
    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

}
