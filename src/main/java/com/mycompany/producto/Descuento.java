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
public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentaje);
    }
}

// Clase GestorDeInventario
class GestorDeInventario {
    private CalculadorDePrecio calculadorDePrecio;

    public GestorDeInventario(CalculadorDePrecio calculadorDePrecio) {
        this.calculadorDePrecio = calculadorDePrecio;
    }

    public double calcularPrecioTotalInventario(List<Producto> productos) {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }
}
