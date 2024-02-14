/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author chuil
 */
public class Circulo extends Figura {
    
    public int radio;

    public int diametro(){
        return (this.radio * 2);
    }
    
    public void asignarRadio(int radio){
        this.radio = radio;
    }
    
    
}
