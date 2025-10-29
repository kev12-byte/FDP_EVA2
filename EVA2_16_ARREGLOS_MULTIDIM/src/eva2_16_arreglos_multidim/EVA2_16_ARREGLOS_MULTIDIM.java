/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_arreglos_multidim;

/**
 *
 * @author Admin
 */
public class EVA2_16_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[3][4];
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
        /*matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[0][3] = 400;*/
        
        // Ciclos anidados:
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < 4; j++) { // columnas
               matriz[i][j] = (int) (Math.random() * 100);
            }
            
        } 
        for (int i = 0; i < 3; i++) { // filas
            for (int j = 0; j < 4; j++) { // columnas
               System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
    }
}
    

        
