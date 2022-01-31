package com.ejercicios_java;

public class Ejercico1 {

    public static void main(String[] args) {

        byte cantidadPuertas = 5;
        short numeroPuerta = 8;
        int numeroCalle = 46;
        long pesoCoche = 4579;

        System.out.println(cantidadPuertas);
        System.out.println(numeroPuerta);
        System.out.println(numeroCalle);
        System.out.println(pesoCoche);

        float precioGasolina = 1.476f;
        double precioGasoil = 1.329d;

        System.out.println(precioGasolina);
        System.out.println(precioGasoil);

        boolean respuesta1 = cantidadPuertas > numeroPuerta;
        boolean respuesta2 = cantidadPuertas < numeroPuerta;

        System.out.println(respuesta1);
        System.out.println(respuesta2);

        String nombre = "Aitor";
        String primerApellido = "Tormo";
        String segundoApellido = "Pérez";

        System.out.println(nombre);
        System.out.println(primerApellido);
        System.out.println(segundoApellido);
        System.out.println(nombre + " " + primerApellido + " " + segundoApellido);

    }


}
