package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void calcularArea() {
        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double circunferencia = 2 * Math.PI * raio;

        System.out.println("A circunferência do círculo é: " + circunferencia);
    }
}
