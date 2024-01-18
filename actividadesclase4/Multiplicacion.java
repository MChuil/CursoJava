import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, bienvenido\n");
        System.out.println("Acontinuacion realizaras una Multiplicacion...\n");
        System.out.println("Dame un numero a Multiplicar:\n ");
        var numOne = scanner.nextLine();
        System.out.println("\n" + "Dame otro numero a multiplicar:\n ");
        var numTwo = scanner.nextLine();
        int result = 0;
        for(int counter = 1; counter <= Integer.parseInt(numTwo); counter++){
                result += Integer.parseInt(numOne);
        }
        System.out.println("\n" + "El resultado es: " + result);
        scanner.close();
    }    
}