package Modulo2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int senhaFinal = 798657;
        Scanner senhaDigitada = new Scanner(System.in);
        System.out.println("Digite seu senha: ");
        int senha = Integer.parseInt(senhaDigitada.nextLine());

        if (senhaFinal == senha) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
