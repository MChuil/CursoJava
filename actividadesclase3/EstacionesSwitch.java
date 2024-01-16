import java.util.Scanner;

public class EstacionesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido, acontinuacion podras saber las estaciones del año...\n ");
        System.out.println("Dame el numero del mes que deseas saber su estacion:\n ");
        var num = scanner.nextLine();
        String resp;
        switch (Integer.parseInt(num)) {
            case 1: 
                resp = "Estacion INVIERNO";
                System.out.println("\n" + resp);
                break;
            case 2: 
                resp = "Estacion INVIERNO";
                System.out.println("\n" + resp);
                break;
            case 3: 
                resp = "Estacion PRIMAVERA";
                System.out.println("\n" + resp);
                break;
            case 4: 
                resp = "Estacion PRIMAVERA";
                System.out.println("\n" + resp);
                break;
            case 5: 
                resp = "Estacion PRIMAVERA";
                System.out.println("\n" + resp);
                break;
            case 6: 
                resp  = "Estacion VERANO";
                System.out.println("\n" + resp);
                break;
            case 7: 
                resp  = "Estacion VERANO";
                System.out.println("\n" + resp);
                break;
            case 8: 
                resp  = "Estacion VERANO";
                System.out.println("\n" + resp);
                break;
            case 9: 
                resp  = "Estacion OTOÑO";
                System.out.println("\n" + resp);
                break;
            case 10: 
                resp  = "Estacion OTOÑO";
                System.out.println("\n" + resp);
                break;
            case 11: 
                resp  = "Estacion OTOÑO";
                System.out.println("\n" + resp);
                break;
            case 12: 
                resp = "Estacion INVIERNO";
                System.out.println("\n" + resp);
                break;
            default:
                resp  = "Mes Incorrecto";
                System.out.println("\n" + resp);
                break;
        }
        scanner.close();
    }
    
}
