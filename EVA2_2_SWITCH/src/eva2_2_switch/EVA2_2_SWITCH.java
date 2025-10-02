/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opc;

        System.out.println("Selecciona una opción:");
        System.out.println("1. Imprimir saldo");
        System.out.println("2. Retirar saldo");
        System.out.println("3. Depositar saldo");
        System.out.print("Opción: ");

        opc = captu.nextInt();

        switch (opc) {
            case 1:
                System.out.println("¡Elegiste imprimir saldo!");
                break;
            case 2:
                System.out.println("¡Elegiste retirar saldo!");
                break;
            case 3:
                System.out.println("¡Elegiste depositar saldo!");
                break;
            default:
                System.out.println("¡Opción incorrecta!");
                break;
        }
    }

}
