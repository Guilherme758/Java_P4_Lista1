package br.edu.univas.lista_atividades1.atv1;

import java.lang.Math;

public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double calculaArea(){
        return 3.14 * Math.pow(this.raio,2); 
    }

    public double calculaPerimetro(){
        return (2 * 3.14) * this.raio; 
    }
}
