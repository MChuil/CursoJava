import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Bienvenida
        System.out.println("Hola, bienvenido\n");
        System.out.println("A continuacion realizaras una Division...\n");

        //Se solicitan los datos al usuario
        System.out.println("Dame un numero a Dividir:\n ");
        var dividendo = scanner.nextLine();
        System.out.println("\n" + "Dame otro numero a Dividir:\n ");
        var divisor = scanner.nextLine();

        /*
         * 8/2= 4
         *  ciclo
         *      dividendo - divisor (8 -2)
         *  fin de cilo
         */
        int result = 0;
        Float cociente = Float.parseFloat(dividendo);  // se le asigna a cociente la cantidad del dividendo (8)
        while( cociente >= Float.parseFloat(divisor)){ // mientras 0 sea mayor o igual a 2
            //cociente -= Float.parseFloat(divisor); // 8 - 2
            cociente = cociente - Float.parseFloat(divisor); // 8 - 2
            result++;
        }
        System.out.println("\n" + "El resultado es: " + result);

        int counter;
        for(counter = 0; cociente >= Float.parseFloat(divisor); counter++){
            cociente = cociente - Float.parseFloat(divisor); // 8 - 2
        }
        System.out.println("\n" + "El resultado es: " + counter);
        scanner.close();        
    }   
}
