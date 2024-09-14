package br.edu.univas.lista_atividades1.atv3;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a altura do retângulo? ");
        double altura = scanner.nextDouble();

        System.out.println("Qual a largura do retângulo?");
        double largura = scanner.nextDouble();

        scanner.close();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("A área do retângulo é: " + retangulo.calculaArea());
        System.out.println("O perímetro do retângulo é: " + retangulo.calculaPerimetro());
    }
}
