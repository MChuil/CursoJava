/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciobanco;

/**
 *
 * @author IANVA
 */
import java.util.Scanner;
public class EjercicioBanco {

    public static void main(String[] args) {
        int resp;
        int saldo = 3000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, Bienvenido al banco MIFEL...");
        System.out.println("Por favor ingresa tu nombre:");
        String Nombre = scanner.nextLine();
        System.out.println("Hola, " + Nombre);
        System.out.println("Ingresa tu numero de cuenta:");
        int numCuenta = scanner.nextInt();
        CuentaBancaria banca = new CuentaBancaria();
        banca.ingresarDatos(3000);
        banca.Mostrar();
        System.out.println("A continuacion podras hacer las siguientes operaciones");
        do{
            System.out.println("Que deseas realizar?");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar saldo");
            int sel = scanner.nextInt();
            if(sel == 1){
                System.out.println("Ingresa la cantidad a depositar:");
                int deposito = scanner.nextInt();
                banca.depositar(deposito);
                System.out.println("Operacion Exitosa...");
            }else if(sel == 2){
                int retiro;
                do{
                    banca.VerSaldo();
                    System.out.println("Ingresa la cantidad a retirar:");
                    retiro = scanner.nextInt();
                    if(retiro <= saldo){
                        banca.retirar(retiro);
                        System.out.println("Operacion Exitosa...");
                    }else{
                        System.out.println("No tiene esa cantidad en su cuenta...");
                        System.out.println("Intentalo de nuevo");  
                    }
                }while(saldo < retiro);
            }else if(sel == 3){
                banca.VerSaldo();
            }
            System.out.println("Desea realizar otra operacion?");
            System.out.println("4. Si");
            System.out.println("5. No");
            resp = scanner.nextInt();
            
        }while(resp == 4);
        scanner.close();
    }
}
