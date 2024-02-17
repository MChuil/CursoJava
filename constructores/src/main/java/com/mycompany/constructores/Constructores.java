/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructores;


/**
 *
 * @author chuil
 */
public class Constructores {

    public static void main(String[] args) {
        Personas person = new Personas("Miguel", "Martinez");
        person.Saludo();
        
        Personas person2 = new Personas("Ian", "Alejandro");
        person2.Saludo();
        
        Personas personita = new Personas();
        
        Personas personota = new Personas ("Gerardo");
    }
}


/**
 * 
 *                              CONSTRUCTORES
 *      Es un metodo con el que cuentan TODAS las clases, sea que lo definamos
 *      explicitamente o no. En caso de que no lo definamos, Java lo crea de forma
 *      automatica.
 * 
 *      ¿Para que sirven?
 *      Para inicializar el objeto y establecer sus propiedades y valores.
 *      El constructor tiene el mismo nombre de la clase y no cuenta con valos 
 *      de retorno. Su función principal es inicializar el objeto.
 * 
 *      Un constructor puede recibir argumentos (parametros) o no.
 * 
 *      
 */
