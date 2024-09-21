package br.edu.univas.lista_atividades1.atv20;

import java.util.Random;

public class JogoAdivinhacao {
    private Random rand = new Random();
    
    private int randomNum = rand.nextInt(100);

    public int getRandomNum(){
        return this.randomNum;
    }
}
