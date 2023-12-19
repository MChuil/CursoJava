package clase01;
import java.util.Scanner;

public class LecturaDatos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        var name = scanner.nextLine();
        System.out.println("Hola " + name + ", Bienvenido al Curso de Java");
        System.out.println("Dame un numero: ");
        var numberOne = scanner.nextLine();
        System.out.println("Dame otro numero: ");
        var numberTwo = scanner.nextLine();
        var suma = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
        // System.out.println("La suma de " + numberOne + " + " + numberTwo +" es: " + (Integer.parseInt(numberOne) + Integer.parseInt(numberTwo)));
        System.out.println("La suma de " + numberOne + " + " + numberTwo +" es: " + suma);
        scanner.close();
    }
}
