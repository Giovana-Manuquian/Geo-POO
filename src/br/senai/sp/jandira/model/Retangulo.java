package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Retangulo extends FormaGeometrica{
    @Override
    public void calcularArea(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Informe a largura do retângulo: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;

        System.out.println("A área do retângulo é: " + area);
    }
    @Override
    public void calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Informe a largura do retângulo: ");
        double largura = scanner.nextDouble();

        double perimetro = 2 * (comprimento + largura);

        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}
