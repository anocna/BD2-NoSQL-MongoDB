package com.farma_rda.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Sucursal {
    private int puntoVenta;
    private Empleado encargado;
    @JsonManagedReference //se coloca en la propiedad de la entidad "padre" que contiene la lista de referencias a la entidad "hija"
    private Domicilio domicilio;

    public Sucursal(int puntoVenta, Empleado encargado, Domicilio domicilio) {
        this.puntoVenta = puntoVenta;
        this.encargado = encargado;
        this.domicilio = domicilio;
    }

    // Getters y setters



    // Getters y setters      
	public int getPuntoVenta() {
		return puntoVenta;
	}

	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
	}

	public Empleado getEncargado() {
		return encargado;
	}

	public void setEncargado(Empleado encargado) {
		this.encargado = encargado;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
       
}
