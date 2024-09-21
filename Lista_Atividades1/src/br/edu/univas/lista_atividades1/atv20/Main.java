package br.edu.univas.lista_atividades1.atv20;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        JogoAdivinhacao jogo = new JogoAdivinhacao();

        while(cont < 3){
            System.out.println("Digite um número de 0 a 99");
            int num = scanner.nextInt();

            if(num == jogo.getRandomNum()){
                System.out.println("Número correto!!!");
                break;
            }
            else if(num <= jogo.getRandomNum()){
                System.out.println("O número inserido está abaixo");
            }
            else{
                System.out.println("O número inserido está acima");
            }
            cont++;
        }
        System.out.println("Número: " + jogo.getRandomNum());

        scanner.close();
    }
}
