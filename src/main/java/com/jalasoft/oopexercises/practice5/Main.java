package com.jalasoft.oopexercises.practice5;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("ped1", "normal", "Juan Perez", "2020-05-05");
        pedido1.addDetalle(new Detalle("cod1", "cocina", 2, 1000, 10, 1990, "ped1"));
        pedido1.addDetalle(new Detalle("cod2", "lavadora", 1, 2500, 0, 2500, "ped1"));
        pedido1.addDetalle(new Detalle("cod3", "plancha", 5, 300, 50, 1450, "ped1"));

        Pedido pedido2 = new Pedido("ped2", "programado", "Maria Guaman", "2020-05-03");
        pedido2.addDetalle(new Detalle("cod4", "mesa", 2, 700, 30, 1370, "ped2"));
        pedido2.addDetalle(new Detalle("cod5", "muebles", 1, 3500, 0, 3500, "ped2"));
        pedido2.addDetalle(new Detalle("cod6", "comoda", 3, 800, 100, 2300, "ped2"));

        Pedido pedido3 = new Pedido("ped3", "normal", "Juan Perez", "2020-05-10");
        pedido2.addDetalle(new Detalle("cod7", "camisa", 10, 100, 100, 900, "ped3"));
        pedido2.addDetalle(new Detalle("cod8", "polera", 20, 80, 0, 1600, "ped3"));
        pedido2.addDetalle(new Detalle("cod9", "zapatos", 8, 400, 200, 3000, "ped3"));

        List<Pedido> pedidos = List.of(pedido1, pedido2, pedido3);

        System.out.println("1. SELECT cliente FROM pedido");
        pedidos.stream().map(Pedido::getCliente).forEach(System.out::println);

        System.out.println("\n2. SELECT cliente FROM pedido WHERE tipoPedido = 'normal'");
        pedidos.stream()
                .filter(pedido -> "normal".equals(pedido.getTipoPedido()))
                .map(Pedido::getCliente)
                .forEach(System.out::println);

        System.out.println("\n3. SELECT codPedido FROM pedido WHERE fecha = '2020-05-05'");
        pedidos.stream()
                .filter(pedido -> "2020-05-05".equals(pedido.getFecha()))
                .map(Pedido::getCodPedido)
                .forEach(System.out::println);

        System.out.println("\n4. SELECT producto FROM detalle, pedido WHERE pedido.codPedido = detalle.codPedido AND pedido.codPedido = 'ped1'");
        pedidos.stream()
                .filter(pedido -> "ped1".equals(pedido.getCodPedido()))
                .map(Pedido::getDetalles)
                .flatMap(List::stream)
                .map(Detalle::getProducto)
                .forEach(System.out::println);

        System.out.println("\n5. SELECT detalle.producto FROM detalle, pedido WHERE pedido.codPedido = detalle.codPedido AND cantidad > 8");
        pedidos.stream()
                .map(Pedido::getDetalles)
                .flatMap(List::stream)
                .filter(detalle -> detalle.getCantidad() > 8)
                .map(Detalle::getProducto)
                .forEach(System.out::println);
    }
}
