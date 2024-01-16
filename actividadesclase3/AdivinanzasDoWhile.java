import java.util.Scanner;

public class AdivinanzasDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 23;
        int counter=0;
        var reponse= "0";
        System.out.println("Bienvenido al Juego de adivinanzas...\n");
        System.out.println("ATENCION! SOLO TIENES 3 INTENTOS\n");
        System.out.println("Adivina el numero que estoy pensando(0-30):\n ");
        do{
            reponse = scanner.nextLine();
            if (Integer.parseInt(reponse) == 23) {
                System.out.println("\n" + "FELICIDADES, has ganado el juego!!");
                break;
            }
            counter++;
            if (counter==3) {
                System.out.println("\n" + "Lo sentimos, has perdido tus intentos");
                System.out.println("GAME OVER..."); 
                break;   
            }else {
                System.out.println("Has fallado, intentalo de nuevo\n");
            }
        }while(Integer.parseInt(reponse) != number);
        scanner.close();
    }
    
}
