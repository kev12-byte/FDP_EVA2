/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_continue;

/**
 *
 * @author Admin
 */
public class EVA2_22_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR NUMEROS PARES
        int i = 0;
        while(i < 100){
         int resi = i % 2; 
         if( resi != 0){//solo va a imprimir los que son divisibles entre 2
             i++;
             continue;//se esta vrincando todos los numeros que no son pares, solo interrumpe la repeticion actual
             //no termina por completo el ciclo 
         }
         System.out.print(i +" - ");
         i++;
        }
    }
    
}
