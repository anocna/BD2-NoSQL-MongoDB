package com.farma_rda.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class ProductoVendido {
	// evita la serialización de vuelta a Venta
	@JsonBackReference //se coloca en la propiedad de la entidad "hija" que apunta de vuelta a la entidad "padre"
    private Venta venta;
    private Producto producto;
    private int cantidad;

    public ProductoVendido(Venta venta, Producto producto, int cantidad) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters y setters
	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
