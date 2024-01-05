package clase03;

import java.util.Scanner;

public class SentenciaIf {

    public static void main(String[] args) {

        /*
         * Sintaxis:
         * If Simple
         * if(condicion){
         * codigo
         * }
         * 
         * IF..Else
         * if(condicion){
         * codigo
         * }else{
         * codigo
         * }
         * 
         * IF anidados
         * if(condicion){
         * codigo
         * }else if(condicion){
         * codigo
         * }else{
         * codigo
         * }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Dame tu edad");
        var edad = scanner.nextLine();

        String mensaje = "NO puedes votar";
        if (Integer.parseInt(edad) >= 18) {
            mensaje = "Puedes votar";
        }
        System.out.println(mensaje);

        /**
         * OPERADOR TERNARIO
         * Es una forma reducida del If...else
         * Sintaxis:
         * (condicion) ? si es verdadero : si es falso;
         * 
         */
        // if (Integer.parseInt(edad) >= 18) {
        // System.out.println("Puedes votar");

        // } else {
        // System.out.println("NO puedes votar");

        // }

        var message = (Integer.parseInt(edad) >= 18) ? "Puedes votar" : false;
        System.out.println(message);

        if (Integer.parseInt(edad) >= 18)
            System.out.println("Puedes votar");
        else
            System.out.println("NO puedes votar");

    }

    /**
     *  Preguntar al usuario por la edad y dependiendo la edad mandar un mensaje personalizado
     *  Rango de valores
     *  Edad de 0 a 1 "Bebe"
     *  de 2 a 12 "Niño"
     *  de 13 a 17 "Adolecente"
     *  de 18 a 25 "Joven"
     *  de 26 a 35 "Adulto Joven"
     *  de 36 a 60 "Adulto"
     *  de 61 a 80 "Adulto Mayor"
     *  de 81 en adelante "Matusalem"
     */

     /*
      * Corregir el error de división en "Calculadora basica"
      */
}