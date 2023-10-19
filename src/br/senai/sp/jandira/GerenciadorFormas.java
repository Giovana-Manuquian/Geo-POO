package br.senai.sp.jandira;
import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.FormaGeometrica;
import br.senai.sp.jandira.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
        System.out.println("Informe a opção que deseja seguir: \n" +
                "1 - Criar Circulo\n" +
                "2 - Crirar Retângulo\n" +
                "3 - Sair"
                );
        System.out.print("Opção: ");

            int opcaoUsuario = scanner.nextInt();

            switch (opcaoUsuario){
                case 1:
                    FormaGeometrica circulo = new Circulo();
                    circulo.calcularPerimetro();
                    circulo.calcularPerimetro();
                    break;
                case 2:
                    FormaGeometrica retangulo = new Retangulo();
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
            if (continuar) {
                System.out.print("Deseja criar e calcular mais formas geométricas? (S/N): ");
                String resposta = scanner.next();
                if (!resposta.equalsIgnoreCase("S")) {
                    continuar = false;
                }
            }
        }
    }
}
