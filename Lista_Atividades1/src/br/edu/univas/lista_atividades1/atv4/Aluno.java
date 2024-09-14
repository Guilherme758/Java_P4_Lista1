package br.edu.univas.lista_atividades1.atv4;

import java.util.*;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Double> notas = new ArrayList<Double>();

    public Aluno(String nome, String matricula, List<Double> notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double calculaMedia(){
        double _soma = 0;
        
        for(int i = 0; i < this.notas.size(); i++){
            _soma += notas.get(i);
        }

        return _soma / this.notas.size();
    }

    public String retornaStatus(){
        double _media = this.calculaMedia();

        return (_media >= 60) ? "Aprovado" : "Reprovado";
    }
}
