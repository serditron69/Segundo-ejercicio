package org.example;

public class Pedido {
    private int numero;
    private String cliente;

    public Pedido() {
    }

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
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

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                '}';
    }


}
