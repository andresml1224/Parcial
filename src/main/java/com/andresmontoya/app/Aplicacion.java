package com.andresmontoya.app;

import com.andresmontoya.domain.Maquina;
import com.andresmontoya.domain.Productos;
import com.andresmontoya.domain.Unidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Productos> listaProductosAM = new ArrayList<>();


        Maquina dispensador1AM = new Maquina(listaProductosAM);

        dispensador1AM.agregarProductosAM("Chocorramo","Activo");
        dispensador1AM.agregarProductosAM("Papas Mayonesa","Activo");
        dispensador1AM.agregarProductosAM("Galletas chocolate","Agotado");
        dispensador1AM.agregarProductosAM("Gaseosa manzana","Agotado");


        int opcion;
        System.out.println("\n\t*******************************");
        System.out.println("\t* BIENVENIDO A LA MAQUINA DISPENSADORA *");
        System.out.println("\t*******************************");
        dispensador1AM.mostrarProductosAM();

        Productos producto1 = new Productos("Galletas chocolate");
        Productos producto2 = new Productos("Gaseosa Uva");



        do {
            System.out.println("1. Mostrar productos");
            System.out.println("2. Mostrar productos agotados");
            System.out.println("3. Sacar productos");
            System.out.println("4. Consultar unidades y todo");
            System.out.println("5. Aumentar la cantidad de unidades");
            System.out.println("0. Salir");
            System.out.print("Ingrese lo que desea consultar: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("*******************************");
                    dispensador1AM.mostrarProductosAM();
                    System.out.println("*******************************");
                    break;
                case 2:
                    System.out.println("*******************************");
                    dispensador1AM.mostrarProductosAgotadosAM();
                    System.out.println("*******************************");
                    break;
                case 3:
                    System.out.print("*******************************");
                    dispensador1AM.mostrarProductosAM();
                    System.out.println("Ingrese que producto desea sacar");
                    int eleccion = Integer.parseInt(sc.nextLine());
                    dispensador1AM.sacarProductoAM(listaProductosAM,eleccion);
                    System.out.println("\n*******************************");
                    break;
                case 4:
                    System.out.println("*******************************");
                    producto1.consultarTotalUnidadesAM(producto1);
                    producto2.consultarTotalUnidadesAM(producto2);
                    break;
                case 5:
                    System.out.println("*******************************");
                    System.out.println("Ingrese a cuanto va a aumentar las unidades de los productos");
                    int aumentoAM = Integer.parseInt(sc.nextLine());
                    producto1.aumentarCantUnidadesAM(producto1,aumentoAM);
                    producto2.aumentarCantUnidadesAM(producto2,aumentoAM);
                    System.out.println("*******************************");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("*******************************");
                    System.out.println("Opcion no valida.");
                    System.out.println("*******************************");
                    break;
            }
        } while (opcion != 0);

    }

}
