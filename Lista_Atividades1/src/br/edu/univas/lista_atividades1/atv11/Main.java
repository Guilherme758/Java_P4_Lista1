package br.edu.univas.lista_atividades1.atv11;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a profissão: ");
        String profissao = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, profissao);

        pessoa.exibirInformacoes();

        scanner.close();
    }
}
