package br.edu.univas.lista_atividades1.atv7;

public class Triangulo {
    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado2, double lado3){
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calculaArea(){
        return (this.base * this.altura) / 2;
    }

    public boolean checaTrianguloValido(){
        return (this.base < this.lado3 + this.lado2 && 
                this.lado2 < this.base + this.lado3 &&
                this.lado3 < this.base + this.lado2)
                ? true : false;
    }
}
