package com.farma_rda.modelo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Crear datos de ejemplo
        Domicilio domicilioA = new Domicilio(1, "Presbitero Jose Malabia", "123", "Lanus", "Buenos Aires");
        Domicilio domicilioB = new Domicilio(2, "29 de Septiembre", "456", "Remedios de Escalada", "Buenos Aires");
        Domicilio domicilioC = new Domicilio(1, "Pablo Nogues", "78", "Lanus", "Buenos Aires");
        Domicilio domicilioD = new Domicilio(2, "Pje. Bidegain", "910", "Remedios de Escalada", "Buenos Aires");
        
        Cliente cliente1 = new Cliente(1001, "González", "Juan", "OSDE", "123456", "obra social", domicilioA);
        Cliente cliente2 = new Cliente(1002, "Pérez", "Ana", "-", "654321", "privado", domicilioB);

        Empleado empleado1 = new Empleado(2001, "López", "Carlos", "20-12345678-9", "encargado", domicilioC);
        Empleado empleado2 = new Empleado(2002, "Martínez", "Laura", "20-98765432-1", "empleado", domicilioD);

        Producto producto1 = new Producto(1, "medicamento", "Ibuprofeno", "Laboratorio A", 100.50);
        Producto producto2 = new Producto(2, "producto de perfumeria", "Shampoo", "Laboratorio B", 50.75);

        Sucursal sucursalA = new Sucursal(1, empleado1, domicilioA);
        Sucursal sucursalB = new Sucursal(2, empleado2, domicilioB);

        Venta venta1 = new Venta(1, "2023-01-01", 150.75, "efectivo", cliente1, empleado1, empleado2, sucursalA, new ArrayList<>());
        Venta venta2 = new Venta(2, "2023-01-02", 200.50, "tarjeta", cliente2, empleado2, empleado1, sucursalB, new ArrayList<>());

        ProductoVendido productoVendido1 = new ProductoVendido(venta1, producto1, 2);
        ProductoVendido productoVendido2 = new ProductoVendido(venta2, producto2, 3);

        venta1.getProductosVendidos().add(productoVendido1);
        venta2.getProductosVendidos().add(productoVendido2);

        List<Venta> ventas = new ArrayList<>();
        ventas.add(venta1);
        ventas.add(venta2);

        // Crear ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Directorio de salida para el archivo JSON
            String outputDirectory = System.getProperty("user.dir") + "/output_json/";

            // Crear el directorio si no existe
            File dir = new File(outputDirectory);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            // Serializar a JSON
            objectMapper.writeValue(new File(outputDirectory + "datos.json"), ventas);

            System.out.println("Datos serializados a JSON correctamente!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
