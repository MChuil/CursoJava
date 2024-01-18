import java.util.Scanner;

public class Factoriales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero para sacar su factorial:\n ");
        var fac = scanner.nextLine();
        /*for(int num = 1; num < Integer.parseInt(fac); num++){
            Integer.parseInt(fac) = Integer.parseInt(fac) - num;

        }*/
        int num = 4;
        int result;
        do { 
            
            result = Integer.parseInt(fac) * num;
            num = num - 1;
        }while(num != 0);
        System.out.println("El factorial es: " + result);



        scanner.close();
    }    
}