/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_1_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int saldo = 5000;
        int pin, opcion, monto, calculo;

        System.out.println("Introduce tu pin:");
        pin = captu.nextInt();

        if (pin == 1234) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar monto");
            System.out.println("3. Depositar monto");
            System.out.println("Selecciona una operacion:");
            opcion = captu.nextInt();

            if (opcion == 1) {
                System.out.println("Tu saldo es: " + saldo);
            } else if (opcion == 2) {
                System.out.println("Cuanto vas a retirar:");
                monto = captu.nextInt();
                if (monto <= saldo) {
                    calculo = saldo - monto;
                    System.out.println("Tu saldo es: " + calculo);
                } else {
                    System.out.println("Monto mayor al saldo");
                }
            } else if (opcion == 3) {
                System.out.println("Cuanto vas a depositar:");
                monto = captu.nextInt();
                if (monto >= 0) {
                    calculo = saldo + monto;
                    System.out.println("Tu saldo es: " + calculo);
                } else {
                    System.out.println("Monto negativo no permitido");
                }
            } else {
                System.out.println("Opcion invalida");
            }
        } else {
            System.out.println("Pin incorrecto!!");
        }
    }
}
