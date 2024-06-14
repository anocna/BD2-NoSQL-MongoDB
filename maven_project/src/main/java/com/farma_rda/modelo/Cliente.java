package com.farma_rda.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Cliente {
    private int dni;
    private String apellido;
    private String nombre;
    private String obraSocialNombre;
    private String obraSocialNumero;
    private String tipoCliente;
    @JsonBackReference //se coloca en la propiedad de la entidad "padre" que contiene la lista de referencias a la entidad "hija"
    private Domicilio domicilio;

    public Cliente(int dni, String apellido, String nombre, String obraSocialNombre, String obraSocialNumero, String tipoCliente, Domicilio domicilio) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.obraSocialNombre = obraSocialNombre;
        this.obraSocialNumero = obraSocialNumero;
        this.tipoCliente = tipoCliente;
        this.domicilio = domicilio;
    }

    // Getters y setters
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObraSocialNombre() {
		return obraSocialNombre;
	}

	public void setObraSocialNombre(String obraSocialNombre) {
		this.obraSocialNombre = obraSocialNombre;
	}

	public String getObraSocialNumero() {
		return obraSocialNumero;
	}

	public void setObraSocialNumero(String obraSocialNumero) {
		this.obraSocialNumero = obraSocialNumero;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
