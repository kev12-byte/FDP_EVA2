/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("Cuatas caloficaciones vas a capturar?");
        tama = captu.nextInt();
        int califas[] = new int[tama];
        //captura valores
        for(int i = 0; i < califas.length; i++){
            System.out.println("calificacion" + (i + 1) + ":");
            califas[i] = captu.nextInt();
        }
        //lee valores los valores que asigne
        for(int i = 0; i < califas.length; i++){
            System.out.print("[" + califas[i] + "]");
            
        }
    }
    
}
