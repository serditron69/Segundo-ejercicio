package org.example;

public class producto {
    private String nombre;
    private String codigo;
    private String precio;

    public producto() {
    }

    public producto(String nombre, String codigo, String precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
