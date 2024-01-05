package clase03;

public class CicloFor {
    
    public static void main(String[] args){


        /*
         * Sintaxis:
         *  for(inicializacion; condicion; interacion){
         *      codigo    
         *  }
         * 
         */
        // int counter = 0;
        // while(counter<=10){
        //     System.out.println("Contador " + counter);
        //     counter++;
        // }


        for(int counter = 0; counter <= 10; counter+= 2){
            System.out.println("Contador " + counter);
        }
    }
}
