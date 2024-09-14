package br.edu.univas.lista_atividades1.atv3;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calculaArea(){
        return this.largura * this.altura;
    }

    public double calculaPerimetro(){
        return 2 * (this.altura + this.largura);
    }
}
