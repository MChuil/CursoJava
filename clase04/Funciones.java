package clase04;

public class Funciones {
    
    public static void main(String[] args){
        /*
         * Las funciones son como subrutinas o subprrogramas que nos permiten
         * dividir el codigo, lo cual da la ventaja de poder darle mantenimiento,
         * enterlo en el futuro y realizar ajustes o cambios de forma mas sencilla.
         * 
         * Las funciones siempre deben retornar algo, aunque sea un vacio
         * 
         *  Para declarar una funcion:
         *      1) que tipo de dato va a retornar(entero, booleano,string, vacio)
         *      2) el nombre de la función
         *      3) Los parametros(opcionales)
         *      4) El codigo de la funcion
         */
        int num = 4;
        int r = multiplicarPorCuatro(num);
        System.out.println("Resultado: " + r);
        saludo();
        double pi = pi();
        System.out.println("PI: " + pi);

        int multi = multiplicar(8, 100);
        System.out.println("Multiplicación: " + multi);
    }

    static int multiplicarPorCuatro(int number){
        int result = number * 4;
        return result;
    }

    static int multiplicar(int numberOne, int numberTwo){
        int result = numberOne * numberTwo;
        return result;
    }

    static double pi(){
        return 3.1416;
    }

    static void saludo(){
        System.out.println("Hola Mundo, desde Java.....2024");
    }

}
