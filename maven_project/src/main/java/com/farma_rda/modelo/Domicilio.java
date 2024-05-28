package com.farma_rda.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Domicilio {
    private int domicilioId;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;
    @JsonBackReference //se coloca en la propiedad de la entidad "hija" que apunta de vuelta a la entidad "padre"
    private Cliente cliente;

    public Domicilio(int domicilioId, String calle, String numero, String localidad, String provincia) {
        this.domicilioId = domicilioId;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    // Getters y setters
    public int getDomicilioId() {
        return domicilioId;
    }

    public void setDomicilioId(int domicilioId) {
        this.domicilioId = domicilioId;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
