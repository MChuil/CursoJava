package clase03;

import java.util.Scanner;

public class CicloWhile {
    
    public static void main(String[] args){

        /**
         *  while(condicion){
         *      codigo
         *  }
         * 
         * */
        
        // boolean aprobado = true;

        // while(aprobado){
        //     System.out.println("Has aprobado");
        //     aprobado = false;
        // }

        int number = 23;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero que estoy pensando(0-30): ");
        var reponse = scanner.nextLine();
        while(Integer.parseInt(reponse) != number){
            System.out.println("Has fallado, intenta con otro número: ");
            reponse = scanner.nextLine();
        }
        scanner.close();

        int counter = 0;
        while(counter<=10){
            System.out.println("Contador " + counter);
            counter++;
        }
    }
}
