/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.producto;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public class ProductoAlimenticio extends Producto{
    private String fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, String fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Producto Alimenticio: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Fecha de Caducidad: " + fechaDeCaducidad;
    }
}
