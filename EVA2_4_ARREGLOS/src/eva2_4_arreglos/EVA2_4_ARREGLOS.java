/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_arreglos;

/**
 *
 * @author Admin
 */
public class EVA2_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SON SECUENCIAS DE DATOS DEL MISMO TIPO(ARREGLOS) CONSECUTIVOS, SE ACCEDEN POR INDICES
        int arreglo[] = new int[5];//5x4= 20bytes de la memoria ram!!
        //primer elemento de arreglo es la posicion --> 0 cero
        //ultimo elemento --> -1
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[3] = 300;
        arreglo[4] = 400;
        arreglo[5] = 500;
        System.out.println("arreglo[0] = " + arreglo [0]);
        System.out.println("arreglo[1] = " + arreglo [1]);
        System.out.println("arreglo[2] = " + arreglo [2]);
        System.out.println("arreglo[3] = " + arreglo [3]);
        System.out.println("arreglo[4] = " + arreglo [4]);
    }
    
}
