package br.edu.univas.lista_atividades1.atv10;

public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.disponivel = true;
    }

    public void emprestarLivro(){
        if(this.disponivel == false){
            System.out.println("O livro está emprestado atualmente.");
        }
        else{
            this.disponivel = false;
        }
    }
    public void devolverLivro(){
        if(this.disponivel == true){
            System.out.println("O livro já foi devolvido.");
        }
        else{
            this.disponivel = true;
        }
    }

    public boolean verificaDisponibilidade(){
        return this.disponivel;
    }
}
