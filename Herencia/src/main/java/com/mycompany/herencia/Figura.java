/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author chuil
 */
public class Figura {
    
    private String color;
    
    public void mover(){
        
    }
    
    public void mostrarColor(){
        System.out.println("Color: " + this.color);
    }
    
    public void asignarColor(String color){
        this.color = color;
    }
    
    private void info(){
        System.out.println("Soy una figura");
    }
   
    
}
