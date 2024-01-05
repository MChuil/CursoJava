package clase03;

import java.util.Scanner;

public class SentenciaSwitch {

    public static void main(String[] args) {

        /**
         * Switch
         * Sintaxis:
         * switch(condicion){
         * case valor:
         * codigo
         * break;
         * case valor:
         * codigo
         * break;
         * default:
         * codigo
         * }
         */

        int month = 7;
        String nameMonth;
        switch (month) {
            case 1:
                nameMonth = "Enero";
                break;
            case 2:
                nameMonth = "Febrero";
                break;
            case 3:
                nameMonth = "Marzoo";
                break;
            case 4:
                nameMonth = "Abril";
                break;
            case 5:
                nameMonth = "Mayo";
                break;
            case 6:
                nameMonth = "Junio";
                break;
            default:
                nameMonth = "Número incorrecto";
                break;
        }

        System.out.println("Mes " + nameMonth);
    }
}