package com.jalasoft.oopexercises.practice5;

public class Detalle {

    private String codDetalle;
    private String producto;
    private int cantidad;
    private int precio;
    private int descuento;
    private int total;
    private String codPedido;

    public Detalle(String codDetalle, String producto, int cantidad, int precio, int descuento, int total, String codPedido) {
        this.codDetalle = codDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
        this.codPedido = codPedido;
    }

    public String getCodDetalle() {
        return codDetalle;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getTotal() {
        return total;
    }

    public String getCodPedido() {
        return codPedido;
    }
}
