/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopoo;

/**
 *
 * @author chuil
 */
public class Foco {
    
    private boolean status = false;  //atributo
    private String color = "Yellow"; //atributo
    
    public void on(){
        this.status = true;
        System.out.println("Encendido...");
    }
    
    public void off(){
        this.status = false;
        System.out.println("Apagado...");
        
    }
    
    public void changeColor(){
        this.color = "White";
        System.out.println("Cambio de color..." + this.color);
    }
    
    public void showColor(){
        System.out.println("Color : " + this.color);
    }
    
    public void showStatus(){
        System.out.println("Estado: " + this.status);
    }
    
    
}
