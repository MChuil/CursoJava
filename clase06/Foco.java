package clase06;

public class Foco {
    //Atributos
    private boolean status = false;
    private int size;

    //Metodos
    public void on(){
        status = true;
        System.out.println("Encendido...");
    }
    
    public void off(){
        status = false;
        System.out.println("Apagado...");
    }

}


/**
 * Objeto Foco
 * 
 *  Attributos
 *      -tamaño
 *      -estado (encendido/apagado)
 * 
 *  Metodos
 *      - encender
 *      - apagar
 * 
 */