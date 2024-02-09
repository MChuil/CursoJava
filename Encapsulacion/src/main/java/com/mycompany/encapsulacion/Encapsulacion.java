/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulacion;

/**
 *
 * @author chuil
 */
public class Encapsulacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        /*Foco f = new Foco();
        f.on();
        f.getState();
        f.off();
        f.changeWhats();
        f.getState();*/
        
        Operaciones oper = new Operaciones();
        oper.numUno = 30;
        oper.numDos = 334;
        oper.operacion(1);
        
    }
}