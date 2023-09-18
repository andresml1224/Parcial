package com.andresmontoya.domain;

import java.util.ArrayList;
import java.util.List;

public class Unidades {
    private List<Integer> unidadesAM = new ArrayList<>();
    private int cantUnidadesAM;
    private Productos productoAM;

    public Unidades(Productos productoAM,int cantUnidadesAM) {
        this.productoAM = productoAM;
        this.cantUnidadesAM = cantUnidadesAM;
    }

    public List<Integer> getUnidadesAM() {
        List<Integer> listaUnidadesAM = new ArrayList<>();
        for (int unidadAM : unidadesAM) {
            listaUnidadesAM.add(unidadAM);
        }
        return listaUnidadesAM;
    }

    public int getCantUnidadesAM() {
        return unidadesAM.size();
    }

    public Productos getProductoAM() {
        return productoAM;
    }

    public void setUnidadesAM(List<Integer> unidadesAM) {
        this.unidadesAM = unidadesAM;
    }
}
