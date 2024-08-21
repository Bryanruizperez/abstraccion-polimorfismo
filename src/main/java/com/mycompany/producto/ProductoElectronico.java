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
public class ProductoElectronico extends Producto{
    private int garantia; // en meses

    public ProductoElectronico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    @Override
    public String getDetalles() {
        return "Producto Electrónico: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Garantía: " + garantia + " meses";
    }
}
