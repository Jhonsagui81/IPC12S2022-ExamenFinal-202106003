/*
Se le solicitarán 2 números al usuario, una vez obtenidos los datos, se debe realizar una
comparación y mostrar al usuario cual es el número mayor de los números que se han ingresado.
*/
package problema1;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int resultado = 0;
        
        System.out.println("Ingrese el numero 1: ");
        numero1 = sc.nextInt();
        
        System.out.println("Ingrese el numero 2: ");
        numero2 = sc.nextInt();
        
        if (numero1 > numero2){
            System.out.println("El numero mayor es: " + numero1);
        } else {
            System.out.println("El numero mayor es: " + numero2);
        }
                
                
    }
    
}
