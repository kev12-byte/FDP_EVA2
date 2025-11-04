/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta_bancaria;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_27_CUENTA_BANCARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TIENE UNA CUENTA BANCARIA CON $1,000,00. USANDO CICLOS, PREGUNTA AL USUARIO CUANTO QUIERE RETIRAR. NO DEJAR DE PREGUNTAR HASTA QUE LA CUENTA BACARIA SE AGOTE 
        //($0) O QUEDE NE NUMEROS ROJOS (NEGATIVOS).
        Scanner captu = new Scanner(System.in);
        double saldo = 1000000;//se usa double por que es un nuemro muy grande de igual manera es el salo con el que se inicia 
        double sacado;
        
        System.out.println("----BIENVENDIO A SU CUENTA BANCARIA----");
        System.out.println("Su saldo actual es: " + saldo);
        
        while(saldo > 0){//voy a utilizar while por que es el ciclo que se repite mientras el saldo sea mayor a 0
            System.out.print("Ingrese que la cantidad que desea retirar: ");
            sacado = captu.nextDouble();
            saldo = saldo - sacado; // el saldo sera igual a la resta del saldo actual menos lo que se saco.
            if (saldo > 0){
            System.out.println("Su retiro se realizo!! su salo actual es: " + saldo);
            }else if (saldo == 0){ // cuando el if ya no se cumpla o que ya no sea verdadedro y este en el valor 0 va a arrojar:
            System.out.println("Su cuenta esta en 0 ya no hay dinero por retirar " + saldo);
            }else {//cuan el if ya no es 0 y pasa ser un numero negativo 
            System.out.println("Su cuenta esta en numeros negativos!! no puede retirar!! " + saldo);
            }
        
        }
        System.out.println("Se finalizo la operacion, buen dia!!");
        
    }
    
}
