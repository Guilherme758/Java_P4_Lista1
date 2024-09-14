package br.edu.univas.lista_atividades1.atv4;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.println("Quantas notas deseja inserir?");
        int numNotas = scanner.nextInt();

        List<Double> notas = new ArrayList<Double>();

        while(numNotas > 0){
            System.out.println("Digite o valor da nota: ");
            notas.add(scanner.nextDouble());
            numNotas--;
        }

        scanner.close();

        Aluno aluno = new Aluno(nome, matricula, notas);

        System.out.println("A média das notas do aluno " + aluno.getNome() + " com o número de matrícula " 
                            + aluno.getMatricula() + " é: " + aluno.calculaMedia());
        System.out.println("O status do aluno é: " + aluno.retornaStatus());
    }
}
