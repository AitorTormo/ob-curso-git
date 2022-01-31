package com.ejercicios_java;

public class Ejercicio2 {

    public static void main(String[] args) {

        int precio1 = 10;
        int precio2 = 34;
        float precio3 = 87.95f;
        float precio4 = 17.95f;

        double precioIva1 = precio1 + precio1 * 0.21;
        double precioIva2 = precio2 + precio2 * 0.21;
        double precioIva3 = precio3 + precio3 * 0.21;
        double precioIva4 = precio4 + precio4 * 0.21;

        System.out.println(precioIva1);
        System.out.println(precioIva2);
        System.out.println(precioIva3);
        System.out.println(precioIva4);

        double resultado1 = precioIva3 + precioIva4;

        System.out.println(resultado1);


    }
}
