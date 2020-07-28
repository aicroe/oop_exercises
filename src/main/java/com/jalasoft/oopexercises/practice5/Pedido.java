package com.jalasoft.oopexercises.practice5;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String codPedido;
    private String tipoPedido;
    private String cliente;
    private String fecha;
    private List<Detalle> detalles;

    public Pedido(String codPedido, String tipoPedido, String cliente, String fecha) {
        this.codPedido = codPedido;
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
        this.fecha = fecha;
        detalles = new ArrayList<>();
    }

    public String getCodPedido() {
        return codPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void addDetalle(Detalle detalle) {
        detalles.add(detalle);
    }
}
