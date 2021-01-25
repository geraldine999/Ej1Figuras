package com.company;

public class Circulo extends com.company.Figura {
    private Double radio;

    public Circulo(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public Double calcularPerimetro() {
        return radio* Math.PI * 2;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

