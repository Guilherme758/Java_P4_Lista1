package br.edu.univas.lista_atividades1.atv6;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double retornaValorTotal(){
        return this.preco * this.quantidade;
    }

    public String retornaDisponibilidade(){
        return (this.quantidade > 0) ? "Disponível" : "Indisponível";
    }
}
