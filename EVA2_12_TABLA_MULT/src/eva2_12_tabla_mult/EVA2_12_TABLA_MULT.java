/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_12_TABLA_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner numero = new Scanner(System.in); // Crear el Scanner
        System.out.print("Ingresa el número para ver su tabla de multiplicar: ");
        int n = numero.nextInt();
        System.out.println("Tabla de multiplicar del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // Cerrar el Scanner que habri en el principio
        numero.close();
    }
    
}
