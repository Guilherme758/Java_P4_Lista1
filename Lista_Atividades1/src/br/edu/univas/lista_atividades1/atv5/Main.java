package br.edu.univas.lista_atividades1.atv5;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o cargo do funcionário");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário do funcionário");
        double salario = scanner.nextDouble();

        System.out.println("Digite os descontos de benefícios do funcionário");
        double descontoBeneficios = scanner.nextDouble();

        scanner.close();

        Funcionario funcionario = new Funcionario(nome, salario, cargo);

        System.out.println("O salário líquido do funcionário é: " + funcionario.calculaSalarioLiquido(descontoBeneficios));
    }
}
