/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructores;

/**
 *
 * @author chuil
 */
public class Personas {
    
    private String name;
    private String lastName;
    
    public Personas(){
        System.out.println("Inicializada la Clase Persona");
    }
    
    //Constructor
    public Personas(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    
    public Personas(String name){
        this.name = name;
        System.out.println("Hola, soy " + this.name + ", sin apellidos ");
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void Saludo(){
        System.out.println("Hola, soy " + this.name + " " + this.lastName);
    }
    
}
