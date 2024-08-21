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
public class Main {
     public static void main(String[] args) {
        Proveedor proveedor = new Proveedor("Proveedor 1");
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1000, 5, proveedor, 24);
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 1, 100, proveedor, "2024-12-31");

        Categoria electronicos = new Categoria("Electrónicos");
        electronicos.agregarProducto(laptop);

        Categoria alimentos = new Categoria("Alimentos");
        alimentos.agregarProducto(manzana);

        List<Producto> inventario = new ArrayList<>();
        inventario.add(laptop);
        inventario.add(manzana);

        CalculadorDePrecio calculadorConDescuento = new CalculadorDePrecioConDescuento(0.1);
        GestorDeInventario gestorDeInventario = new GestorDeInventario(calculadorConDescuento);

        double precioTotal = gestorDeInventario.calcularPrecioTotalInventario(inventario);
        System.out.println("Precio total del inventario con descuento: " + precioTotal);

        Descuento descuento = new Descuento(0.2);
        GestorDeDescuentos gestorDeDescuentos = new GestorDeDescuentos(descuento);
        double precioConDescuento = gestorDeDescuentos.aplicarDescuento(precioTotal);
        System.out.println("Precio total del inventario después de aplicar un descuento adicional: " + precioConDescuento);
    }
}
