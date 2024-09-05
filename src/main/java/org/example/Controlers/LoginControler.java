package org.example.Controlers;

import org.example.Models.ClienteModel;
import org.example.Models.ProcuradorModel;
import org.example.Views.LoginView;

import java.util.HashMap;
import java.util.Map;

public class LoginControler {
    private LoginView vista;
    private Map<String, ClienteModel> clientes; // Map para almacenar clientes simulados
    private Map<String, ProcuradorModel> procuradores; // Map para almacenar procuradores simulados

    public LoginControler(LoginView vista) {
        this.vista = vista;
        clientes = new HashMap<String, ClienteModel>();
        procuradores = new HashMap<String, ProcuradorModel>();

        // Inicializamos con algunos clientes y procuradores simulados
        clientes.put("cliente123", new ClienteModel("cliente123", "Juan Pérez", "Calle 123"));
        procuradores.put("procurador456", new ProcuradorModel("procurador456", "Ana Gómez", "Avenida 456"));
    }

    public void iniciarAplicacion() {
        String dni = vista.obtenerDNI();

        // Primero verificamos si el DNI corresponde a un cliente
        if (clientes.containsKey(dni)) {
            ClienteModel cliente = clientes.get(dni);
            vista.mostrarBienvenida(cliente.getNombre(), "Cliente");
            redirigirCliente(cliente);
        }
        // Luego verificamos si corresponde a un procurador
        else if (procuradores.containsKey(dni)) {
            ProcuradorModel procurador = procuradores.get(dni);
            vista.mostrarBienvenida(procurador.getNombre(), "Procurador");
            redirigirProcurador(procurador);
        }
        // Si no se encuentra en ninguna lista
        else {
            vista.mostrarError("DNI no reconocido.");
        }
    }

    // Método para redirigir a la vista del cliente
    private void redirigirCliente(ClienteModel cliente) {
        // Aquí se puede inicializar el controlador de Cliente
        System.out.println("Iniciando sesión como Cliente...");
        // Puedes agregar aquí el código para manejar la vista y el controlador del Cliente
    }

    // Método para redirigir a la vista del procurador
    private void redirigirProcurador(ProcuradorModel procurador) {
        // Aquí se puede inicializar el controlador de Procurador
        System.out.println("Iniciando sesión como Procurador...");
        // Puedes agregar aquí el código para manejar la vista y el controlador del Procurador
    }
}