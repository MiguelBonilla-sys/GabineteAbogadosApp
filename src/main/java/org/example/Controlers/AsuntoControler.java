package org.example.Controlers;

import org.example.Models.AsuntoModel;
import org.example.Views.AsuntoView;
import java.util.ArrayList;
import java.util.List;

public class AsuntoControler {
    private AsuntoView vista;
    private List<AsuntoModel> asuntos;

    public AsuntoControler(AsuntoView vista) {
        this.vista = vista;
        this.asuntos = new ArrayList<AsuntoModel>();
    }

    public void agregarAsunto() {
        AsuntoModel nuevoAsunto = vista.crearAsunto();
        asuntos.add(nuevoAsunto);
        vista.mostrarMensaje("Asunto agregado con éxito.");
    }

    public void mostrarAsuntos() {
        for (AsuntoModel asunto : asuntos) {
            vista.mostrarAsunto(asunto);
        }
    }
}