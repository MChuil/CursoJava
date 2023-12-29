import java.util.Scanner;
public class LecturaDatos {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cual es tu Nombre?");
        var name = lector.nextLine();
        System.out.println("Hola " + name + ", bienvenido...\n");
        System.out.println("Acontinuacion realizaras operaciones aritmeticas:\n");
        System.out.println("REALIZA UNA SUMA");
        System.out.println("Dame un numero a Sumar: ");
        var numberOne = lector.nextLine();
        System.out.println("Dame otro numero a Sumar: ");
        var numberTwo = lector.nextLine();
        var suma = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
        System.out.println("La suma de " + numberOne + " + " + numberTwo +" es: " + suma + "\n");
        System.out.println("REALIZA UNA RESTA");
        System.out.println("Dame un numero a Restar: ");
        var numberThree = lector.nextLine();
        System.out.println("Dame otro numero a Restar: ");
        var numberFor = lector.nextLine();
        var resta = Integer.parseInt(numberThree) - Integer.parseInt(numberFor);
        System.out.println("La resta de " + numberThree + " - " + numberFor + " es: " + resta + "\n");
        System.out.println("REALIZA UNA MULTIPLICACION");
        System.out.println("Dame un numero a Multiplicar: ");
        var numberFive = lector.nextLine();
        System.out.println("Dame otro numero a Multiplicar: ");
        var numberSix = lector.nextLine();
        var multiplicacion = Integer.parseInt(numberFive) * Integer.parseInt(numberSix);
        System.out.println("La multiplicacion de " + numberFive + " x " + numberSix + " es: " + multiplicacion + "\n");
        System.out.println("REALIZA UNA DIVISION");
        System.out.println("Dame un numero a Dividir: ");
        var numberSeven = lector.nextLine();
        System.out.println("Dame otro numero a Dividir: ");
        var numberEight = lector.nextLine();
        var division = Float.parseFloat(numberSeven) / Float.parseFloat(numberEight);
        System.out.println("La division de " + numberSeven + " / " + numberEight + " es: " + division);
        lector.close();
    }
}
