package br.edu.univas.lista_atividades1.atv8;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public void exibiVelocidadeAtual(){
        System.out.println("A velocidade atual do carro é: " + this.velocidadeAtual);
    }

    public void acelerar(){
        this.velocidadeAtual += 30;
    }

    public void frear(){
        if(this.velocidadeAtual - 30 < 0){
            this.velocidadeAtual = 0;
        }
        else{
            this.velocidadeAtual -= 30;
        }
    }
}
