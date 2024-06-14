package com.farma_rda.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;

public class Venta {
    private int numeroTicket;
    private String fecha;
    private double totalVenta;
    private String formaPago;
    @JsonManagedReference 
    private Cliente cliente;
    @JsonManagedReference 
    private Empleado empleadoAtendio;
    @JsonManagedReference 
    private Empleado empleadoCobro;
    @JsonManagedReference 
    private Sucursal sucursal;
    @JsonManagedReference //maneja la lista de ProductoVendido
    private List<ProductoVendido> productosVendidos;

    public Venta(int numeroTicket, String fecha, double totalVenta, String formaPago, Cliente cliente, Empleado empleadoAtendio, Empleado empleadoCobro, Sucursal sucursal, List<ProductoVendido> productosVendidos) {
        this.numeroTicket = numeroTicket;
        this.fecha = fecha;
        this.totalVenta = totalVenta;
        this.formaPago = formaPago;
        this.cliente = cliente;
        this.empleadoAtendio = empleadoAtendio;
        this.empleadoCobro = empleadoCobro;
        this.sucursal = sucursal;
        this.productosVendidos = productosVendidos;
    }

    // Getters y setters
    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleadoAtendio() {
        return empleadoAtendio;
    }

    public void setEmpleadoAtendio(Empleado empleadoAtendio) {
        this.empleadoAtendio = empleadoAtendio;
    }

    public Empleado getEmpleadoCobro() {
        return empleadoCobro;
    }

    public void setEmpleadoCobro(Empleado empleadoCobro) {
        this.empleadoCobro = empleadoCobro;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<ProductoVendido> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<ProductoVendido> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }
}
