
package problema2;

import java.util.Scanner;


public class Problema2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeroColumnas = 0;
       
        do{
        System.out.println("Ingrese el numero de columnas: ");
        numeroColumnas= sc.nextInt();
        }while(numeroColumnas%2 == 0);
       
        
        System.out.println("");
        for (int i = 1; i <= numeroColumnas-i+1; i++) {
            for (int j = 1; j <=numeroColumnas - i; j++) {
                System.out.print(" ");
            }
             for (int k = 1; k <= (i*2)-1; k++) {
                 System.out.print("*");
            }
            System.out.println();
        }
        
       
        
    }
    
}
