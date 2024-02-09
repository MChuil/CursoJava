/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulacion;

/**
 *
 * @author chuil
 */
public class Operaciones {
    
    public int numUno;
    public int numDos;
    
    public void operacion(int op){
        switch(op){
            case 1:
              System.out.println(this.suma());
               break;
            default:
                System.out.println("Error de seleccion");
                break;
        }
    }
    
    protected int suma(){
        return this.numUno + this.numDos;
    }
    
    private int resta(){
        return this.numUno + this.numDos;
    }
    
    private int division(){
        return this.numUno + this.numDos;
    }
    
    private int multiplicacion(){
        return this.numUno + this.numDos;
    }
}
