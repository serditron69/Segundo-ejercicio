package org.example;

public class main {
    public static void main(String[] args){

        producto p1 = new producto("manzana", "1010", "2.000");
        producto p2 = new producto("pera", "1020", "3.000");
        producto p3 = new producto("piña", "1030", "4.000");

        Pedido pe1 = new Pedido(1, "persona 1");
        Pedido pe2 = new Pedido(2, "persona 2");

        pe1.agregarProducto(p1);
        pe1.agregarProducto(p2);
        pe2.agregarProducto(p3);
        pe2.agregarProducto(p1);

        pe1.mostrarDetalles();
        System.out.println();
        pe2.mostrarDetalles();

    }

}
