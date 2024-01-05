package clase03;

public class OpreadoresCondicionales {
    

    public static void main(String args[]){


        /*
         * && (and) Y
         * Regla:
         * Si ambas condiciones son verdaderas, el resultado final es verdadero
         * Si alguna de las condiciones es falsa, el resultado final es falso
         * Si ambas condicionales son falsas, el resultado final es falso
         */

        var salary = 500;
        int valMin = 200, valMax = 310;
        boolean result = (salary >= valMin && salary <= valMax);
        System.out.println("¿Mi salario es minimo? " + result);

        /*
         * || (or) O
         * Regla:
         * Si ambas condicionales son verdaderas, el resultado final es verdadero
         * Si ambas condicionales son falsas, el resultado final es falso
         * Si una de las condiciones es verdadera, el resultado final es verdadero
         */

        var day = 30;
        int payDay = 15, payDayTwo = 30;
        boolean isPayDay = day == payDay || day == payDayTwo;
        System.out.println("Hoy es dia de págo " + isPayDay);
    }
}
