package org.example;

import org.example.Controlers.AsuntoControler;
import org.example.Controlers.LoginControler;
import org.example.Views.AsuntoView;
import org.example.Views.LoginView;

public class Main {
    public static void main(String[] args) {
        // Inicializar las vistas
        LoginView loginView = new LoginView();
        AsuntoView asuntoView = new AsuntoView();

        // Inicializar los controladores
        LoginControler loginControler = new LoginControler(loginView);
        AsuntoControler asuntoControler = new AsuntoControler(asuntoView);

        // Iniciar la aplicación con el controlador de login
        loginControler.iniciarAplicacion();

        // Ejemplo de uso del controlador de asuntos
        asuntoControler.agregarAsunto();
        asuntoControler.mostrarAsuntos();
    }
}