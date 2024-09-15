package br.edu.univas.lista_atividades1.atv10;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do livro");
        String titulo = scanner.nextLine();
        
        System.out.println("Digite o autor do livro");
        String autor = scanner.nextLine();

        System.out.println("Digite o número de páginas do livro");
        int numPaginas = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, numPaginas);

        scanner.close();

        HashMap<Boolean, String> mapLivro = new HashMap<Boolean, String>(){{
            put(true, "Livro Disponível");
            put(false, "Livro Indisponível");
        }};

        livro.emprestarLivro();
        System.out.println(mapLivro.get(livro.verificaDisponibilidade()));
        livro.emprestarLivro();
        System.out.println(mapLivro.get(livro.verificaDisponibilidade()));

        livro.devolverLivro();
        System.out.println(mapLivro.get(livro.verificaDisponibilidade()));
        livro.devolverLivro();
        System.out.println(mapLivro.get(livro.verificaDisponibilidade()));

        livro.emprestarLivro();
        System.out.println(mapLivro.get(livro.verificaDisponibilidade()));
    }
}
