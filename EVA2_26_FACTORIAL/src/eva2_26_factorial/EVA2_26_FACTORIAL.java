/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //SOLICITAR UN NUMERO AL USUARIO Y CALCULAR SU FACTORIAL. EJEMPLO: EL 
        //USUARIO INTRUDUCE 5, EL FACTORIAL ES 120 . (5 * 4 * 3 * 2 * 1)
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingresa el numero del cual quieres saber su factorial: ");
        int numero = captu.nextInt();
        int facto = 1;
        for (int i = numero; i >= 1; i--){//comienza a hacer la multiplicacion y va restando hasta que llega a 1 se detiene 
        facto = facto * i;// multiplica lo que sale en la variable facto por que esta en i
        }
        System.out.print("El factorial de: "  + numero + " es: " + facto);
        System.out.println();
    }
    
}
