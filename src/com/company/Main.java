package com.company;

public class Main {

    public static void main(String[] args) {
        // 1 - ejercicio con figuras
        //Crear un sistema que permita calcular el perímetro y área de una figura.
        //Las figuras pueden ser cuadrados, triángulos o círculos.
        //Todas las figuras tienen un color asignado, que puede consultarse.
        //Nota: el valor de Pi pueden tomarlo como 3.14 o pueden usar la constante Math.PI

        Cuadrado cuadrado = new Cuadrado("Rojo", 89.0);
        Triangulo triangulo = new Triangulo("Violeta", 23.0, 25.0, 25.0, 23.0);
        Circulo circulo = new Circulo("Azul", 5.78);

        System.out.println("El perimetro del cuadrado es de "+ cuadrado.calcularPerimetro());
        System.out.println("El perimetro del triangulo es de "+ triangulo.calcularPerimetro());
        System.out.println("El perimetro del circulo es de "+ circulo.calcularPerimetro());

        System.out.println("El area del cuadrado es de "+ cuadrado.calcularArea());
        System.out.println("El area del triangulo es de  "+ triangulo.calcularArea());
        System.out.println("El area del circulo es de "+ circulo.calcularArea());

        System.out.println(cuadrado.getColor());
        System.out.println(circulo.getColor());
        System.out.println(triangulo.getColor());

    }

}

