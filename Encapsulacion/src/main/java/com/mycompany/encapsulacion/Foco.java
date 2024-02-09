/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulacion;

/**
 *
 * @author chuil
 */
public class Foco {
    
    private boolean state = false;
    private String whats = "100w";
    /**
     *  public  Se puede tener acceso desde la clase que la declaro, la clases heredadas y desde fuera de la clase
     *  private Solo puede acceder la clase que lo declaro
     *  protected Tiene acceso la clase que lo declaro y las clases hijas
     */
    
    public void on(){
        this.state = true;
       System.out.println("Encendido");
    }
    
    public void off(){
        this.state =false;
    }
    
    public void getState(){
        System.out.println("Estado del foco " + this.state);
    }
    
    public void changeWhats(){
        this.whats = "50w";
    }
}
