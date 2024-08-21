/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.producto;

import java.util.List;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public interface CalculadorDePrecio {
    double calcularPrecioTotal(List<Producto> productos);
}

// Implementación CalculadorDePrecioConDescuento
class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    private double descuento;

    public CalculadorDePrecioConDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.precio * producto.cantidad;
        }
        return total * (1 - descuento);
    }
}
