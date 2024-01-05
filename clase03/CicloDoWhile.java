package clase03;

import java.util.Scanner;

public class CicloDoWhile {

    public static void main(String[] args) {

        /*
         * Sintaxis
         * do{
         * codigo
         * }while(condicion)
         */

        int number = 23;
        Scanner scanner = new Scanner(System.in);
        var reponse= "0";
        do{
            System.out.println("Adivina el numero que estoy pensando(0-30): ");
            reponse = scanner.nextLine();
        }while(Integer.parseInt(reponse) != number);
        scanner.close();
    }
}
