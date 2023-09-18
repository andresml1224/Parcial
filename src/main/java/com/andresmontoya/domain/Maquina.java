package com.andresmontoya.domain;

import java.util.ArrayList;
import java.util.List;
public class Maquina {
    private List <Productos> productosAM = new ArrayList<>();
    private List<Productos> productosAgotadosAM = new ArrayList<>();

    private String estadoProductoAM;
    private static final int PRODUCTOS_MAX_AM = 10;

    public Maquina(List<Productos> nombreProductoAM) {
        this.productosAM = nombreProductoAM;
    }

    public void agregarProductosAM(String nombreProductosAM, String estadoProductoAM) {
        List<Productos> productosAM = new ArrayList<>();
        productosAM.add(new Productos(nombreProductosAM));

        this.productosAM.addAll(productosAM);

        if (!estadoProductoAM.equals("Activo")) {
            productosAgotadosAM.add(productosAM.get(0));
        }
    }
    public void mostrarProductosAM() {
        int Cont = 0;
        for (Productos productosAM : productosAM) {
            System.out.println(Cont + " || " + productosAM.getNombreProductoAM());
            Cont++;
        }
    }
    public void mostrarProductosAgotadosAM() {
        if (productosAgotadosAM.isEmpty()) {
            System.out.println("No hay productos agotados");
        } else {
            for (Productos productosAM : productosAgotadosAM) {
                System.out.println(productosAM.getNombreProductoAM());
            }
        }
    }

    public void sacarProductoAM(List<Productos> productos, int eleccion) {
        if (!productos.contains(productos.get(eleccion))) {
            System.out.println("El producto no existe");
            return;
        }
        productos.remove(eleccion);
    }


}







    /* public void agregarProductosAM(String nombreProductoAM, List<Productos> productosAM, List<Productos> productosAgotadosAM, String estadoProducto) {
        if (productosAM.size() < PRODUCTOS_MAX_AM){
            this.productosAM.add((ArrayList<Productos>) productosAM);
        } else if (!estadoProducto.equals("Agotado")) {
            this.productosAM.add((ArrayList<Productos>) productosAgotadosAM);
        } else {
            System.out.println("No se pueden crear mas productos");
        }
    }*/


