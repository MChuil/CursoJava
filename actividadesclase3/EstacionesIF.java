import java.util.Scanner;
public class EstacionesIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido, acontinuacion podras saber las estaciones del año...\n ");
        System.out.println("Dame el numero del mes que deseas saber su estacion:\n ");
        var num = scanner.nextLine();
        if (Integer.parseInt(num) >= 1 && Integer.parseInt(num) <= 2 || Integer.parseInt(num) == 12) {
            System.out.println("\n" + "Estacion INVIERNO");   
        }else if (Integer.parseInt(num) >= 3 && Integer.parseInt(num) <= 5) {
            System.out.println("\n" + "Estacion PRIMAVERA");    
        }else if (Integer.parseInt(num) >= 6 && Integer.parseInt(num) <= 8) {
            System.out.println("\n" + "Estacion VERANO");   
        }else if (Integer.parseInt(num) >= 9 && Integer.parseInt(num) <= 11) {
            System.out.println("\n" + "Estacion OTOÑO");
        }else 
        System.out.println("\n" + "Mes Incorrecto");
        scanner.close();
    }   
}
