package org.example.Models;

import java.util.Date;
import java.util.List;

public class AsuntoModel {
    private String numeroExpediente;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private String estado; // En trámite, archivado, etc.
    private ClienteModel cliente;
    private List<ProcuradorModel> procuradores;

    public AsuntoModel(String numeroExpediente, Date fechaInicio, Date fechaFinalizacion, String estado, ClienteModel cliente, List<ProcuradorModel> procuradores) {
        this.numeroExpediente = numeroExpediente;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.cliente = cliente;
        this.procuradores = procuradores;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public List<ProcuradorModel> getProcuradores() {
        return procuradores;
    }

    public void setProcuradores(List<ProcuradorModel> procuradores) {
        this.procuradores = procuradores;
    }
}