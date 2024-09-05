package org.example.Views;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner = new Scanner(System.in);

    public String obtenerDNI() {
        System.out.println("Ingrese su DNI:");
        return scanner.nextLine();
    }

    public void mostrarBienvenida(String nombre, String rol) {
        System.out.println("Hola, " + nombre + "! Usted está registrado como " + rol + ".");
    }

    public void mostrarError(String mensaje) {
        System.out.println(mensaje);
    }
}
