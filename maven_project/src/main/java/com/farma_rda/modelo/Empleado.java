package com.farma_rda.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Empleado {
    private int dni;
    private String apellido;
    private String nombre;
    private String cuil;
    private String puesto;
    @JsonManagedReference //se coloca en la propiedad de la entidad "padre" que contiene la lista de referencias a la entidad "hija"
    private Domicilio domicilio;

    public Empleado(int dni, String apellido, String nombre, String cuil, String puesto, Domicilio domicilio) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuil = cuil;
        this.puesto = puesto;
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

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
