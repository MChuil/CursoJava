/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author chuil
 */
public class Rectangulo extends Figura {
    
    public int base;
    public int altura;
    
    public int angulos(){
        return 0;
    }
    
    public int area(int base, int altura){
        return base * altura;
    }
    
}
