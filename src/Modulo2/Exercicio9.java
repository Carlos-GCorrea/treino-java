package Modulo2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = ler.nextInt();
        System.out.println("Digite o peso do doador (em kg): ");
        double peso = ler.nextDouble();

        if (peso < 50.0) {
            System.out.println("Doador incompatível com um peso fora dos padrões");
        } else if (idade < 18 || idade > 65 ) {
            System.out.println("Doador incompatível, idade fora do intervalo permitido");
        }else {
            System.out.println("Doador compatível");
        }
    }
}
