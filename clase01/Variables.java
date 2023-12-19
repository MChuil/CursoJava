package clase01;
public class Variables {
    
    public static void main(String[] args) {
        
        String saludo = "Hola Mundo...";

        System.out.println(saludo);
        System.out.println(saludo);
        System.out.println(saludo);

        var mensaje = "Nueva forma de declarar variables";
        System.out.println(mensaje);

        var name = "Ian Josue";
        var age = 20;
        System.out.println("Hola, soy " + name + ", tengo " + age + " años");


        var numberOne = 23;
        var numberTwo = 7;
        System.out.println("Hola desde Java, " + numberOne + numberTwo); //identifica un string de inicio y concatena los numeros
        System.out.println(numberOne + numberTwo + " Hola..."); //identifica que es un numero y realiza la operación y despues concatena el string
        System.out.println(numberOne + " " + numberTwo + " Hola...");

        //Caracteres especiales
        var nameTwo = "Michael";
        var lastName = "Jackson";

        System.out.println(nameTwo + " " + lastName);

        System.out.println("Nombre: \n" + nameTwo + "\nApellidos: \n" + lastName); //Salto de linea

        System.out.println("Tabulador: \t" + nameTwo ); //Tabulación

        System.out.println("Retroceso: \b\b" + lastName);

        System.out.println("Retorno de carro \r" + lastName);

        System.out.println("Comillas simples: '" + nameTwo + "'");
        
        System.out.println("Comillas dobles \"" + nameTwo + "\"");
    }
}