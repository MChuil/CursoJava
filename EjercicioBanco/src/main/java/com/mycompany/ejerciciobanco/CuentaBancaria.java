/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciobanco;

/**
 *
 * @author IANVA
 */
public class CuentaBancaria {
    private String Nombre;
    private int numCuenta;
    private int saldo; 
    private int deposito;
    
    public void ingresarDatos(int saldo){
        //this.Nombre = Nombre;
        //this.numCuenta = numCuenta;
        this.saldo = saldo;
        //return saldo;
    }
    
    public void Mostrar(){
        //System.out.println("Tu nombre es: " + this.Nombre);
        //System.out.println("Tu numero de cuenta es: " + this.numCuenta);
        System.out.println("Tu saldo es: " + this.saldo);
    }
    
     public void retirar(int retiro){
        //System.out.println("Cuanto deseas retirar?");
        this.saldo = (this.saldo) - retiro;
    }
    public void depositar(int deposito){
        //System.out.println("Cuanto deseas depositar?");
        this.saldo = this.saldo + deposito;
        //return deposito;
    }
   
    public void VerSaldo(){
        System.out.println("Tu saldo actual es: " + this.saldo);
    }
}
