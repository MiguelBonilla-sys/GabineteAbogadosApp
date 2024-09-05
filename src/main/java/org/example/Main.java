package org.example;

import org.example.Controllers.AsuntoController;
import org.example.Controllers.LoginController;
import org.example.Views.AsuntoView;
import org.example.Views.LoginView;

public class Main {
    public static void main(String[] args) {
        // Inicializar las vistas
        LoginView loginView = new LoginView();
        AsuntoView asuntoView = new AsuntoView();

        // Inicializar los controladores
        LoginController loginController = new LoginController(loginView);
        AsuntoController asuntoController = new AsuntoController(asuntoView);

        // Iniciar la aplicación con el controlador de login
        loginController.iniciarAplicacion();

        // Ejemplo de uso del controlador de asuntos
        asuntoController.agregarAsunto();
        asuntoController.mostrarAsuntos();
    }
}