package br.senai.sp.jandira.model;

import java.util.Scanner;

public class FormaGeometrica {
    public void calcularArea(){
        Scanner scanner = new Scanner(System.in);

        int base, altura;

        System.out.println("Informe a base: ");
        base = scanner.nextInt();
        System.out.println("Informe a altura: ");
        altura = scanner.nextInt();

        int resultado = base * altura;

        System.out.println("O resultado é: " + resultado);
    }
    public void calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);

        int comprimento, largura;

        System.out.println("Informe o comprimento: ");
        comprimento = scanner.nextInt();
        System.out.println("Informe a largura: ");
        largura = scanner.nextInt();

        int resultado = 2 * (comprimento + largura);

        System.out.println("O resultado do perímetro é: " + resultado);
    }
}
