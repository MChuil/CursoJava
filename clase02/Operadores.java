public class Operadores {
    
    public static void main(String[] args) {

        //operadores aritmeticos ===========================================
        // + - * /
        int a = 9, b = 22;
        int result = a + b;
        System.out.println("suma = " + result);
        System.out.println("suma = " + (a + b));
        
        result = b-a;
        System.out.println("resta = " + result);
        System.out.println("resta = " + (b - a));

        result = b % a; //obtiene el residuo de una división
        System.out.println("Residuo de 22/9 = " + result);

        //asignación ===========================================
        
        int c = 5;
        // c = c + b;
        c +=b; //operador de composición
        System.out.println("c = " + c);

        c -= a;  // c = c - a;
        System.out.println("c = " + c);


        //operadores unarios ===========================================

        int x = 6;
        int y = +x;  //cambio de signo
        System.out.println("valor de Y " + y);

        boolean w = true;
        boolean v = !w; //negamos el valor que viene despues del simbolo
        System.out.println("valor de V " + v);

        //Incremento
        //preincremento
        int e = 4;
        int f = ++e; //e = e + 1   e += 1
        System.out.println("valor de E " + e);
        System.out.println("valor de F " + f);

        //postincremento
        int g = 8;
        int h = g++;
        System.out.println("valor de g " + g);
        System.out.println("valor de h " + h);

        //Decremento
        //predecremento
        int i = 23;
        int j = --i;
        System.out.println("valor de  i " + i);
        System.out.println("valor de  j " + j);

        //postdecremento
        int k = 3;
        System.out.println("valor de k " + k);
        int l = k--;
        System.out.println("valor de l " + l);
        System.out.println("valor de k " + k);

        //operadores de igualdad y relacionales ===========================================

        int m = 2, n = 4;

        boolean igual = (m == n);  //comparación de igualdad
        System.out.println("iguales  = " + igual);

        igual = (m != n); //si son diferentes
        System.out.println("iguales  = " + igual);

        boolean mayor = (m > n);
        System.out.println("mayor = " + mayor);

        boolean menor = (m< n);
        System.out.println("menor = " + menor);

        boolean mayorIgual = (m >= n);
        System.out.println("mayorIgual = " + mayorIgual);

        boolean menorIgual = (m <= n);
        System.out.println("menorIgual = " + menorIgual);

        String cadenaUno = "Hola";
        String cadenaDos = "hola";

        boolean resultadoCadena = cadenaUno.equals(cadenaDos); //(cadenaUno == cadenaDos);
        System.out.println("resultadoCadena = " + resultadoCadena);
    }
}

/**
 * 1. Pedirle al usuario un numero
 * 2. Pasarlo a entero
 * 3. identificar si el numero es 'par' mandando un mensaje
 *      ej. 9   'El numero es impar' 
 *      ej. 8   'El numero es par' 
 */


/**
  * Usar el archivo lectura de datos, para crear una calculadora básica (+,-,/,*)
  *     Seleccione la opcion deseada
  *     1) Suma
  *     2) Resta
  *     3) División
  *     4) Multiplicación
  */