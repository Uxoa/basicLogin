package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definir las credenciales correctas y el número máximo de intentos
        final String usuarioCorrecto = "admin";
        final String contraseñaCorrecta = "1234";
        int intentos = 3;

        // Crear el objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para permitir hasta 3 intentos de autenticación
        while (intentos > 0) {
            System.out.print("Ingresa tu usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Ingresa tu contraseña: ");
            String contraseña = scanner.nextLine();

            // Verificar si las credenciales son correctas
            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                System.out.println("¡Bienvenido!");
                break;  // Salir del bucle si la autenticación es exitosa
            } else {
                intentos--;  // Reducir el número de intentos restantes
                System.out.println("Nombre o Contraseña incorrectos. Intentos restantes: " + intentos);

                if (intentos == 0) {
                    System.out.println("Ha excedido el número máximo de intentos. Acceso denegado.");
                }
            }
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
