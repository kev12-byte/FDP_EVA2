/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_24_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLICITE UN VALOR AL USUARIO Y CON ESE VALOR IMPRIMA EL SIGUENTE PATRON USANDO CICLOS:
        //EJEMPLO: EL USUARIO CAPTURA 5
        //*
        //**
        //***
        //****
        //*****
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = captu.nextInt();
        for (int i = 1; i <= num; i++) {// ESTA PARTE VA A CONTROLAR EL NUMERO DE FILAS, O MAS BIEN EL NUMERO QUE ELJE EL USUARIO
             for (int a = 1; a <= i; a++){//AQUI VA A IMPRIMIR LOS *
                 System.out.print("*");//ESTO ES LO QUE VA A IMPRIMIR 
             }
             System.out.println();//salto de linea 
    }
        
        
    }
    
}
