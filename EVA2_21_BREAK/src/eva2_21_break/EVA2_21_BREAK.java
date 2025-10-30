/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_21_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu =  new Scanner(System.in);
        int valor, adivinar;
        adivinar = (int)(Math.random() * 5) + 1;// numeros entre el 1 y el 5
        while(true){
        System.out.println("Adivina el numero. -1 para terminar");
        valor = captu.nextInt();
        if(valor == adivinar){
         System.out.println("Felicidades!! adivinaste!!");
        }
        if(valor == -1)
            break;//termina por completo es ciclo que es infinito
        }
         System.out.println("Gracias por jugar!!");
    }
    
}
