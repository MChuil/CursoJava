import java.util.Scanner;

public class AdivinanzasWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Juego de adivinanzas...\n");
        System.out.println("ATENCION! SOLO TIENES 3 INTENTOS\n");
        System.out.println("Adivina el numero que estoy pensando(0-30):\n ");
        var reponse = scanner.nextLine();
        int number = 23;
        int counter = 1;
        // while(Integer.parseInt(reponse) != number){
        //     System.out.println("\n" + "Has fallado, intentalo de nuevo:\n ");
        //     reponse = scanner.nextLine();
        //     counter++;
        //     if(Integer.parseInt(reponse) == 23) {
        //         System.out.println("\n" + "FELICIDADES, has ganado el juego!!");
        //         break;
        //     }
        //     if (counter==3) {
        //         System.out.println("Lo sentimos, has perdido tus intentos"); 
        //         System.out.println("GAME OVER..."); 
        //         break;  
        //     }
        // }
        // if (Integer.parseInt(reponse) == 23) {
        //     System.out.println("\n" + "FELICIDADES, has ganado el juego!!");
        // }
        // scanner.close();

        while(counter < 3){
            if(Integer.parseInt(reponse) == 23) {
                System.out.println("\n" + "FELICIDADES, has ganado el juego!!");
                break;
            }else{
                System.out.println("\n" + "Has fallado, intentalo de nuevo:\n ");
                reponse = scanner.nextLine();
                counter++;
            }
        }
        if(counter==3) {
                System.out.println("Lo sentimos, has perdido tus intentos"); 
                System.out.println("GAME OVER..."); 
        }
        scanner.close();
    }
    
}
