package com.farma_rda.modelo;


public class Producto {
    private int codigoNumerico;
    private String tipo;
    private String descripcion;
    private String laboratorio;
    private double precio;

    public Producto(int codigoNumerico, String tipo, String descripcion, String laboratorio, double precio) {
        this.codigoNumerico = codigoNumerico;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.laboratorio = laboratorio;
        this.precio = precio;
    }

    // Getters y setters

	public int getCodigoNumerico() {
		return codigoNumerico;
	}

	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}

