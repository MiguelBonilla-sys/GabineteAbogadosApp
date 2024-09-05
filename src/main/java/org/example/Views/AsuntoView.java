package org.example.Views;

import java.util.Scanner;
import java.sql.Date;
import org.example.Models.AsuntoModel;
import org.example.Models.ClienteModel;
public class AsuntoView {
    private Scanner scanner = new Scanner(System.in);

    public AsuntoModel crearAsunto() {
        System.out.println("Ingrese el número de expediente:");
        String numeroExpediente = scanner.nextLine();

        System.out.println("Ingrese la fecha de inicio (YYYY-MM-DD):");
        Date fechaInicio = java.sql.Date.valueOf(scanner.nextLine());

        System.out.println("Ingrese la fecha de finalización (YYYY-MM-DD):");
        Date fechaFinalizacion = java.sql.Date.valueOf(scanner.nextLine());

        System.out.println("Ingrese el estado del asunto (en trámite, archivado, etc.):");
        String estado = scanner.nextLine();

        ClienteModel cliente = crearCliente();

        return new AsuntoModel(numeroExpediente, fechaInicio, fechaFinalizacion, estado, cliente, null);
    }

    public ClienteModel crearCliente() {
        System.out.println("Ingrese el DNI del cliente:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la dirección del cliente:");
        String direccion = scanner.nextLine();

        return new ClienteModel(dni, nombre, direccion);
    }

    public void mostrarAsunto(AsuntoModel asunto) {
        System.out.println("Número de expediente: " + asunto.getNumeroExpediente());
        System.out.println("Fecha de inicio: " + asunto.getFechaInicio());
        System.out.println("Fecha de finalización: " + asunto.getFechaFinalizacion());
        System.out.println("Estado: " + asunto.getEstado());
        System.out.println("Cliente: " + asunto.getCliente().getNombre());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}