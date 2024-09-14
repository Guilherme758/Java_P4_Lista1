package br.edu.univas.lista_atividades1.atv2;

public class ContaBancaria {
    private String numConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numConta, String nomeTitular){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public String getNumConta(){
        return this.numConta;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor) throws Exception{
        if(valor > this.saldo){
            throw new Exception("O valor requisitado (" + valor + ") é maior do que o disponível");
        }
        this.saldo -= valor;
    }
}
