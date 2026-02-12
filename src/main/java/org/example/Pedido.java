package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String cliente;
    private List<producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<producto> getProductos() {
        return productos;
    }

    public void setProductos(List<producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(producto p) {
        this.productos.add(p);
    }

    public void mostrarDetalles() {
        System.out.println("Pedido{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                '}');
        System.out.println("Productos:");
        for (producto prod : productos) {
            System.out.println("  " + prod);
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", productos=" + productos +
                '}';
    }
}