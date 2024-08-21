/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.producto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public class Categoria {
     private String nombre;
    private List<Producto> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public List<Producto> getProductos() {
        return productos;
    }
}
