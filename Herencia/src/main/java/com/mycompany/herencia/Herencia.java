/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author chuil
 */
public class Herencia {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
       Circulo cir = new Circulo();
       cir.asignarColor("Azul");
       cir.mostrarColor();
       
       Triangulo tri = new Triangulo();
       tri.asignarColor("Verde");
       tri.mostrarColor();
       
       Rectangulo rec= new Rectangulo();
       rec.asignarColor("Rojo");
       rec.mostrarColor();
       
       Cuadrado cua = new Cuadrado();
       cua.asignarColor("Morado");
       cua.mostrarColor();
        
        //fig.mostrarColor();
    }
    
    /**
     * La herencia se da entre clases, donde existe una clase que va a heredar (clase Padre) y la
     * clase o clases que reciben (clases hijas)
     * 
     * La herencia ayuda a evitar redundancia de codigo
     */
    
    
}
