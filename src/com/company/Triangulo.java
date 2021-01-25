package com.company;

public class Triangulo extends com.company.Figura {

    private Double base;
    private Double lado1;
    private Double lado2;
    private Double altura;

    public Triangulo(String color, Double base, Double lado1, Double lado2, Double altura) {
        super(color);
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public Double calcularPerimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public Double calcularArea() {
        return (base * altura) / 2;
    }
}
