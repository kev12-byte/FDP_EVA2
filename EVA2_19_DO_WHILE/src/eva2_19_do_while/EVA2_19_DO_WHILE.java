/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_19_DO_WHILE {
final static String USUARIO = "admin";
final static String PWD = "admin";
    public static void main(String[] args) {
        // TODO code application logic here
        //1. PEDIMOS DATOS DE ACCESO
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        //2. VALIDAMOS
        //INCORRECTO --> VOLVER A PREGUNTAR
        //CORRECTO--> ACCESO AL SISTEMA
        do{
        System.out.println("Usuario:");
        usu = captu.nextLine();
        System.out.println("Contrasenia:");
        contra = captu.nextLine();
        }while(!(usu.equals(USUARIO)&& contra.equals(PWD))); //!niega todo, si es verdadero lo hace falso y si es falso lo hace veradero, se le llama negacion,tiene que ser verdadera toda la linea para que esto se pueda repetir
        if(usu.equals(USUARIO)&& contra.equals(PWD))
            System.out.println("ACCESO CONCEDIDO. BIENVENDIO AL SISTEMA!!");
        else
            System.out.println("ACCESO DENEGADO!!");
        
    }
    
}
