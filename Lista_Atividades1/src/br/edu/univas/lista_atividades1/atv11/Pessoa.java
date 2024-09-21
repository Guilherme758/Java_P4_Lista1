package br.edu.univas.lista_atividades1.atv11;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    private int calcAnosBissextos(){
        return idade / 4;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Idade em anos bissextos: " + calcAnosBissextos());
    }

}
