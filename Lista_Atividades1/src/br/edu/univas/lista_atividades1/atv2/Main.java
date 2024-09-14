package br.edu.univas.lista_atividades1.atv2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        String numConta = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeTitular = scanner.nextLine();

        scanner.close();

        ContaBancaria contaBancaria = new ContaBancaria(numConta, nomeTitular);

        System.out.println("Número da Conta: " + contaBancaria.getNumConta());
        System.out.println("Nome do Titular: " + contaBancaria.getNomeTitular() + '\n');

        System.out.println("Realizando depósito de 1000 reais.");
        contaBancaria.depositar(1000);
        System.out.println("Saldo atual: " + contaBancaria.getSaldo() + '\n');

        System.out.println("Realizando saque de 500 reais.");
        
        try{
            contaBancaria.sacar(500);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Saldo atual: " + contaBancaria.getSaldo() + '\n');

        System.out.println("Realizando saque de 600 reais.");
        
        try{
            contaBancaria.sacar(600);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
    }
}
