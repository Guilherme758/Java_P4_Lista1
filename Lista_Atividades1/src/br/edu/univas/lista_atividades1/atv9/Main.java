package br.edu.univas.lista_atividades1.atv9;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do paciente");
        int idade = scanner.nextInt();

        Paciente paciente = new Paciente(nome, idade);

        System.out.println("Quantas consultas deseja inserir?");
        int numConsultas = scanner.nextInt();

        scanner.nextLine();

        while(numConsultas > 0){
            System.out.println("Qual a descrição da consulta?");
            String descricao = scanner.nextLine();

            System.out.println("Qual a data da consulta? Padrão (dd/MM/yyyy)");
            LocalDate data = LocalDate.parse(scanner.nextLine(), formatter);

            Consulta consulta = new Consulta(descricao, data);

            paciente.adicionarConsulta(consulta);

            numConsultas--;
        }

        scanner.close();

        paciente.exibiHistoricoConsultas();
    }
}
