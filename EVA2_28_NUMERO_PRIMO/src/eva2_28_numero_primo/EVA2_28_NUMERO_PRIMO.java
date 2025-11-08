/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_numero_primo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_28_NUMERO_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PEDIR UN NUMERO AL USUSRIO Y DETERMINAR SI ES PRIMO O NO
        Scanner captu = new Scanner(System.in);
        int val;
        boolean esPrimo = true;
        System.out.println("Introduce el valor:");
        val = captu.nextInt();
        for (int i = 2; i < val; i++){
            //division excata 
            int residuo = val % i; 
            if (residuo == 0){//ya no es primo
                esPrimo=false;
            }
        }
        if(esPrimo)
            System.out.println("El valor:" + val +" Es primo");
        else
         System.out.println("El valor:" + val +" No es primo");   
    }
    
}
