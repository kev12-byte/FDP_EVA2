/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_triangulo_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_25_TRIANGULO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //REPETIR LA PRACTICA ANTERIOR, PERO GENERAR EL SIGUIENTE PATRON:
        //*
        //**
        //***
        //****
        //*****
        //****
        //***
        //**
        //*
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingresa el numero: ");
        int num = captu.nextInt();
        //PARA IMPRIMIR LOS VALORES QUE ESTAN ARRIBA COMO EN EL CODIGO ANTERIOR
        for (int i = 1; i <= num; i++){//VA A IR AGREGANDO LOS VALORES DE 1 EN 1 POR FILA HASTA QUE LLEGE AL QUE PUSO EL USUARIO
        for (int a = 1; a <= i; a++){//va a controlar el numero de filas
        System.out.print("*");//ES IGUAL QUE EL CODIGO ANTERIOR 
        }
        System.out.println();
        }
        //comienza la parte que esta abajo, se tiene que comenzar justo donde el otro termina
        for (int i = num -1; i >= 1; i--){//todo lo que hizo en la anterior, lo va a hacer restando 1 a los *
        for ( int a = 1; a <= i; a++){//genera el numero de filas que va a crear
            System.out.print("*");
        }
        System.out.println();
        }
    }
    
}
