package com.andresmontoya.domain;

import java.util.ArrayList;
import java.util.List;

public class Productos {
    private List<Productos> productosAM = new ArrayList<>();
    private String nombreProductoAM;
    private List<Unidades> unidadesAM = new ArrayList<>();
    private List<Productos> productosAgotadosAM = new ArrayList<>();

    private int cantUnidadesAM;
    private static final int UNIDADES_MAX_AM = 8;

    public Productos(List<Productos> productosAM){
        this.productosAM = productosAM;
    }

    public Productos(String nombreProductosAM) {
        this.nombreProductoAM = nombreProductosAM;
    }


    public int consultarTotalUnidadesAM(Productos productoAM) {
        double totalUnidadesAM = 0.0;
        for (Unidades unidadAM : unidadesAM) {
            if (unidadAM.getProductoAM().equals(productoAM)) {
                for (int unidadIndividualAM : unidadAM.getUnidadesAM()) {
                    totalUnidadesAM += unidadIndividualAM;
                }
            }
        }
        return (int) totalUnidadesAM;
    }

    public void aumentarCantUnidadesAM(Productos productoAM, int cantidadUnidadesAM) {
        for (Unidades unidadAM : unidadesAM) {
            if (unidadAM.getProductoAM().equals(productoAM)) {
                for (int unidadIndividualAM : unidadAM.getUnidadesAM()) {
                    cantidadUnidadesAM += unidadIndividualAM;
                }
                if (cantidadUnidadesAM > UNIDADES_MAX_AM) {
                    cantidadUnidadesAM = UNIDADES_MAX_AM;
                }
                unidadAM.getUnidadesAM().add(cantidadUnidadesAM);
                break;
            }
        }
    }


    public List<Productos> getProductosAM() {
        return productosAM;
    }

    public String getNombreProductoAM(){return nombreProductoAM;}

    public List<Unidades> getUnidadesAM() {
        return unidadesAM;
    }

    public List<Productos> getProductosAgotadosAM() {
        return productosAgotadosAM;
    }


}
