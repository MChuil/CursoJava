import java.util.Scanner;

public class CalculadoraBas {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var emp = "";
        System.out.println("¿Cual es tu nombre?");
        var name = scanner.nextLine();
        System.out.println("\n" + "Hola " + name + ", bienvenido a la calculadora basica...\n");
        do {
            System.out.println("¿Que deseas realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            var op = scanner.nextLine();
            if (Integer.parseInt(op) == 1) {
                suma();
            } else if (Integer.parseInt(op) == 2) {
                resta();
            } else if (Integer.parseInt(op) == 3) {
                division();
            } else if (Integer.parseInt(op) == 4) {
                multiplicacion();
            } else {
                noDisp();
            }
            System.out.println("\n" + "¿Deseas realizar otra operacion?");
            System.out.println("5. Si");
            System.out.println("6. Salir");
            emp = scanner.nextLine();
        } while (Integer.parseInt(emp) == 5);
        scanner.close();
    }

    static void suma() {
        System.out.println("\n" + "SUMA\n");
        System.out.println("Dame un numero a Sumar: ");
        var numberOne = scanner.nextLine();
        System.out.println("Dame otro numero a Sumar: ");
        var numberTwo = scanner.nextLine();
        var suma = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
        System.out.println("La suma de " + numberOne + " + " + numberTwo + " es: " + suma + "\n");
    }

    static void resta() {
        System.out.println("\n" + "RESTA\n");
        System.out.println("Dame un numero a Restar: ");
        var numberThree = scanner.nextLine();
        System.out.println("Dame otro numero a Restar: ");
        var numberFor = scanner.nextLine();
        var resta = Integer.parseInt(numberThree) - Integer.parseInt(numberFor);
        System.out.println("La resta de " + numberThree + " - " + numberFor + " es: " + resta + "\n");
    }

    static void division() {
        System.out.println("\n" + "DIVISION\n");
        System.out.println("Dame un numero a Dividir: ");
        var numberFive = scanner.nextLine();
        System.out.println("Dame otro numero a Dividir: ");
        var numberSix = scanner.nextLine();
        if (Integer.parseInt(numberSix) == 0) {
            System.out.println("\n" + "ATENCION, EL NUMERO 0 NO PUEDE UTILIZARSE");
            System.out.println("Intentalo de nuevo\n");
            System.out.println("Dame otro numero a Dividir");
            var numberNew = scanner.nextLine();
            var division = Float.parseFloat(numberFive) / Float.parseFloat(numberNew);
            System.out.println("La division de " + numberFive + " / " + numberNew + " es: " + division);
        } else if (Integer.parseInt(numberSix) != 0) {
            var division = Float.parseFloat(numberFive) / Float.parseFloat(numberSix);
            System.out.println("La division de " + numberFive + " / " + numberSix + " es: " + division);
        }
    }

    static void multiplicacion() {
        System.out.println("\n" + "MULTIPLICACION\n");
        System.out.println("Dame un numero a Multiplicar: ");
        var numberSeven = scanner.nextLine();
        System.out.println("Dame otro numero a Multiplicar: ");
        var numberEight = scanner.nextLine();
        var multiplicacion = Integer.parseInt(numberSeven) * Integer.parseInt(numberEight);
        System.out
                .println("La multiplicacion de " + numberSeven + " x " + numberEight + " es: " + multiplicacion + "\n");
    }

    static void noDisp() {
        System.out.println("\n" + "OPCION NO DISPONIBLE");
    }
}
