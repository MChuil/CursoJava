public class Primitivos {
    
    public static void main(String[] args) {
        
        //byte, short, int, long
        byte byteVar = 16;
        System.out.println("byteVar = " + byteVar);
        
        System.out.println("Cantidad de bits en byte = " + Byte.SIZE );
        System.out.println("Cantidad de bytes en byte = " + Byte.BYTES );
        System.out.println("Valor minimo en byte = " + Byte.MIN_VALUE );
        System.out.println("Valor maximo en en byte = " + Byte.MAX_VALUE);
        
        short shortVar = 1000;
        System.out.println("shortVar = " + shortVar);

        System.out.println("Cantidad de bits en short = " + Short.SIZE );
        System.out.println("Cantidad de bytes en short = " + Short.BYTES );
        System.out.println("Valor minimo en short = " + Short.MIN_VALUE );
        System.out.println("Valor maximo en en short = " + Short.MAX_VALUE);
        
        
        int intVar = 5000;
        System.out.println("intVar = " + intVar);

        System.out.println("Cantidad de bits en integer = " + Integer.SIZE );
        System.out.println("Cantidad de bytes en integer = " + Integer.BYTES );
        System.out.println("Valor minimo en integer = " + Integer.MIN_VALUE );
        System.out.println("Valor maximo en en integer = " + Integer.MAX_VALUE);
        
        
        long longVar  = 10000;
        System.out.println("longVar = " + longVar);

        System.out.println("Cantidad de bits en long = " + Long.SIZE );
        System.out.println("Cantidad de bytes en long = " + Long.BYTES );
        System.out.println("Valor minimo en long = " + Long.MIN_VALUE );
        System.out.println("Valor maximo en en long = " + Long.MAX_VALUE);

        float floatVar = 100;
        System.out.println("floatVar = " + floatVar);

        System.out.println("Cantidad de bits en float = " + Float.SIZE );
        System.out.println("Cantidad de bytes en float = " + Float.BYTES );
        System.out.println("Valor minimo en float = " + Float.MIN_VALUE );
        System.out.println("Valor maximo en float = " + Float.MAX_VALUE);

        double doubleVar = 100;
        System.out.println("doubleVar = " + doubleVar);

        System.out.println("Cantidad de bits en double = " + Double.SIZE );
        System.out.println("Cantidad de bytes en double = " + Double.BYTES );
        System.out.println("Valor minimo en double = " + Double.MIN_VALUE );
        System.out.println("Valor maximo en double = " + Double.MAX_VALUE);

        char charVar = 'a';
        System.out.println("charVar = " + charVar);

        System.out.println("Cantidad de bits en char = " + Character.SIZE );
        System.out.println("Cantidad de bytes en char = " + Character.BYTES );
        System.out.println("Valor minimo en char = " + (int) Character.MIN_VALUE );
        System.out.println("Valor maximo en char = " + (int) Character.MAX_VALUE);

        boolean booleanVar = true;
        System.out.println("booleanVar = " + booleanVar);

        System.out.println("True = " + Boolean.TRUE);
        System.out.println("False = " + Boolean.FALSE);

        boolean casado = true;
        if(casado == true){
            System.out.println("El valor es verdadero");
        }else{
            System.out.println("El valor es falso");
        }
        
        int edad = 27;
        boolean esAdulto = edad >= 18;
        System.out.println("Mayor de edad " + esAdulto);


        // de String a int
        var age = "22";
        int newAge = Integer.parseInt(age);
        System.out.println("Edad = " + newAge);

        var valorPI = "3.1416";
        double PI = Double.parseDouble(valorPI); 
        System.out.println("Valor de PI = " + PI);

        var valorFloat = "45.2";
        float varFloat = Float.parseFloat(valorFloat);
        System.out.println("Valor de varFloat = " + varFloat);


        
    }
}
