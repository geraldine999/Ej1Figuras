package com.company;

public class Cuadrado extends com.company.Figura {

    private Double lado;

    public Cuadrado(String color, Double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public Double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public Double calcularArea() {
        return  Math.pow(lado, 2);
    }
}
