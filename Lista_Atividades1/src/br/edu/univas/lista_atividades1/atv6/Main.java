package br.edu.univas.lista_atividades1.atv6;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto");
        int quantidade = scanner.nextInt();

        scanner.close();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("O valor total de estoque do produto " + produto.getNome() + " é: " + produto.retornaValorTotal());
        System.out.println("A disponiblidade do produto é: " + produto.retornaDisponibilidade());
    }
}
