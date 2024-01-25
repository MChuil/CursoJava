/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplopoo;

/**
 *
 * @author chuil
 */
public class EjemploPoo {

    public static void main(String[] args) {
        Foco bombilla = new Foco();
        bombilla.showStatus();
        bombilla.on();
        bombilla.showStatus();
        bombilla.showColor();
        bombilla.changeColor();
        bombilla.showColor();
        bombilla.off();
    }
}
