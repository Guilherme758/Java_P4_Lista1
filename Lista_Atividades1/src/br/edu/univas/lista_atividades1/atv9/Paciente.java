package br.edu.univas.lista_atividades1.atv9;

import java.util.*;

public class Paciente {
    private String nome;
    private int idade;
    private List<Consulta> consultas = new ArrayList<Consulta>();

    public Paciente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void adicionarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public void exibiHistoricoConsultas(){
        System.out.println("Paciente: " + this.nome);
        System.out.println("Idade: " + idade);

        for(int i = 0; i < this.consultas.size(); i++){
            this.consultas.get(i).exibiDetalhes();
        }
    }
}
