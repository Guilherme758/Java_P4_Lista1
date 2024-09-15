package br.edu.univas.lista_atividades1.atv5;

public class Funcionario {
    public String nome;
    public double salario;
    public String cargo;

    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calculaSalarioLiquido(double descontoBeneficios){
        double descontoINSS = 0;
        double descontoIRRF = 0;

        // Desconto INSS
        if(this.salario < 1412.01){
            descontoINSS = this.salario * 0.075;
        }
        else if(this.salario < 2666.69){
            descontoINSS = this.salario * 0.09;
        }
        else if(this.salario < 4000.04){
            descontoINSS = this.salario * 0.12;
        }
        else if(this.salario <= 7786.02) {
            descontoINSS = this.salario * 0.14;
        }

        // Desconto IRRF
        if(this.salario >= 2112.01 && this.salario <= 2826.65){
            descontoIRRF = this.salario * 0.075 - 158.4;
        }
        else if(this.salario < 3751.06){
            descontoIRRF = this.salario * 0.15 - 370.4;
        }
        else if(this.salario < 4664.69){
            descontoIRRF = this.salario * 0.225 - 651.73;
        }
        else{
            descontoIRRF = this.salario * 0.275 - 884.96;
        }

        return this.salario - descontoINSS - descontoIRRF - descontoBeneficios;
    }
}
