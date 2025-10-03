/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_arreglo_string;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_ARREGLO_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int dia;
        String diasSemana[] = new String[7];
        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miercoles";
        diasSemana[4] = "Jueves";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Sabado";
        System.out.println("Introduce el dia en numero (0 - 6)");
        dia = captu.nextInt();
         System.out.println("El dia es: " + diasSemana[dia]);
        
    }
    
}
