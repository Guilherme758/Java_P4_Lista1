package br.edu.univas.lista_atividades1.atv7;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
    
        System.out.println("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o lado 1 do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o lado 2 do triângulo: ");
        double lado2 = scanner.nextDouble();
    
        scanner.close();

        Triangulo triangulo = new Triangulo(base, altura, lado1, lado2); 

        HashMap<Boolean, String> msgFinal = new HashMap<>(){{
            put(false, "O triângulo não é válido");
            put(true, "O triângulo é válido");
        }};

        boolean trianguloValido = triangulo.checaTrianguloValido();

        System.out.println(msgFinal.get(trianguloValido));

        if (trianguloValido == true) {
            System.out.println("A área do triângulo é: " + triangulo.calculaArea());
        }
    }
}
