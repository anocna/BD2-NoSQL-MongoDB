package com.farma_rda.modelo;


public class FarmaciaProducto {
    private Sucursal sucursal;
    private Producto producto;

    public FarmaciaProducto(Sucursal sucursal, Producto producto) {
        this.sucursal = sucursal;
        this.producto = producto;
    }

    // Getters y setters
	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
