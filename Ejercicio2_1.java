package com.ejercicios_java;

public class Ejercicio2_1 {

    public static void main(String[] args) {

        int precio1 = 10;
        int precio2 = 20;
        int precio3 = 30;

        // IVA = 21%
        // Precio con IVA = Precio producto + suma IVA

        double precioIva1 = precio1 + precio1 * 0.21;
        double precioIva2 = precio2 + precio2 * 0.21;
        double precioIva3 = precio3 + precio3 * 0.21;

        System.out.println(precioIva1);
        System.out.println(precioIva2);
        System.out.println(precioIva3);

        double resultado1 = precioIva1;
        double resultado2 = precioIva2;
        double resultado3 = precioIva3;

        double precioIva4 = resultado1 + resultado3;

        System.out.println(precioIva4);


    }
}
