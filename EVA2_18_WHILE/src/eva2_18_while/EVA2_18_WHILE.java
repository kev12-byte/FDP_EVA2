/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_while;

/**
 *
 * @author Admin
 */
public class EVA2_18_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;//si este valor camboa y es mayor que 10, no va a imprimir nada
        while(i<=10 ){//se va reprtir si la condicion es verdaderda
            System.out.println("KEVIN CONDE");
            i++;
        }
        //SIMULAR UN FOR CON DO WHILE
        System.out.println("----CICLO DO WHILE-----");
        i = 1;
        do{
            System.out.println("KEVIN CONDE");
            i++;
        }while(i<=10);
    }
    
}
