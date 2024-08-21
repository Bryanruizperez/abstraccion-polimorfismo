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
public class GestorDeDescuentos {
     private Descuento descuento;

    public GestorDeDescuentos(Descuento descuento) {
        this.descuento = descuento;
    }

    public double aplicarDescuento(double precio) {
        return descuento.aplicarDescuento(precio);
    }
}
