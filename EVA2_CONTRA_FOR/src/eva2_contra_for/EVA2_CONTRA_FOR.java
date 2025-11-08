package eva2_contra_for;

import java.util.Scanner;

public class EVA2_CONTRA_FOR {
    final static String PWD = "21042006";
    final static String USUARIO = "admin";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contrasenia, usu;
        boolean accesoCorrecto = false;

        // 4 intentos, y el programa termna 
        for (int i = 1; i <= 4; i++) {
            System.out.print("Usuario: ");
            usu = input.nextLine().trim(); // quitamos espacios al inicio/fin

            System.out.print("Contraseña: ");
            contrasenia = input.nextLine();

            
            if (usu.equalsIgnoreCase(USUARIO) && contrasenia.equals(PWD)) {
                accesoCorrecto = true;
                System.out.println("Acceso correcto. ¡Bienvenido, " + usu + "!");
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intento " + i + " de 4.");
                if (i == 4) {
                    System.out.println("Se han agotado los intentos. Acceso denegado.");
                }
            }
        }

        // Si hay acceso correcto,contontinua
        if (accesoCorrecto) {
            // Aquí puedes poner el código que deba ejecutar un usuario autenticado
            System.out.println("Continuando con las operaciones permitidas...");
        }

        input.close();
    }
}
