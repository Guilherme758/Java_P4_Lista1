package br.edu.univas.lista_atividades1.atv8;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        scanner.close();

        Carro carro = new Carro(marca, modelo);

        System.out.println("Acelerando o carro");
        carro.acelerar();
        carro.exibiVelocidadeAtual();

        System.out.println("Freando o carro");
        carro.frear();
        carro.exibiVelocidadeAtual();

        System.out.println("Freando o carro");
        carro.frear();
        carro.exibiVelocidadeAtual();
    }
}
