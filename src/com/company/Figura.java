package com.company;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract Double calcularPerimetro();

    public abstract Double calcularArea();
}
