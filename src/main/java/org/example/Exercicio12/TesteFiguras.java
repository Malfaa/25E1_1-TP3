package org.example.Exercicio12;

public class TesteFiguras {
    public static void main(String [] args){
        Circulo circulo = new Circulo();
        Esfera esfera = new Esfera();

        circulo.raio = 3.0;
        esfera.raio = 5.0;

        circulo.calcularArea();
        esfera.calcularVolume();
        System.out.printf("Area: %.02f\nVolume: %.02f\n\n",
                circulo.calcularArea(),
                esfera.calcularVolume());
    }
}