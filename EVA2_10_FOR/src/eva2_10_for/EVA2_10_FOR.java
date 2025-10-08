/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // IMPRIMIR LOS NUMEROS DEL 1 - 20
        for(int i = 1; i <= 20; i++)
            System.out.print(i + "-");

        // Imprimir los numeros pares de 0 a 100
        System.out.println("");
        for(int i = 0; i <= 100; i+=2)
            System.out.print(i + "-");

        // Repetir el anterior, en orden inverso
        System.out.println("");
        for(int i = 100; i >= 0; i-=2)
            System.out.print(i + "-");

        // IMPRIMIR LA LISTA DE NUMEROS ENTRE CUALQUIER VALOR QUE EL USUARIO QUIERA
        System.out.println("");
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = numero.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = numero.nextInt();
        System.out.println("");
        if(a <= b)
            for(int i = a; i <= b; i++)
                System.out.print(i + "-");
        else
            for(int i = a; i >= b; i--)
                System.out.print(i + "-");

        // IMPRIMIR LA TABLA DE MULTIPLICAR (1 al 10) DEL NUMERO QUE EL USUARIO INDIQUE
        System.out.println("");
        System.out.print("Ingresa el número para ver su tabla de multiplicar: ");
        int n = numero.nextInt();
        System.out.println("Tabla de multiplicar del " + n + ":");
        for(int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));

        // se cierra el scanner, toda la variable que use "numero"
        numero.close();
    }
}
