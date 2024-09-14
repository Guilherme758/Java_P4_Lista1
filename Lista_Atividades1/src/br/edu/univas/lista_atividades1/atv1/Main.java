package br.edu.univas.lista_atividades1.atv1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o raio do círculo? ");

        double raio = scanner.nextDouble();

        scanner.close();

        Circulo circulo = new Circulo(raio);

        System.out.println("A área do círculo é: " + circulo.calculaArea());
        System.out.println("O perímetro do círculo é: " + circulo.calculaPerimetro());
    }
}
