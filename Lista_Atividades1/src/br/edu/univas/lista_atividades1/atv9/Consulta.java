package br.edu.univas.lista_atividades1.atv9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private String descricao;
    private LocalDate data;
    private DateTimeFormatter _formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Consulta(String descricao, LocalDate data){
        this.descricao = descricao;
        this.data = data; 
    }

    public void exibiDetalhes(){
        System.out.println("Consulta: " + this.descricao);
        System.out.println("Data: " + data.format(_formatter));
    }
}
