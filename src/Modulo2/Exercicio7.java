package Modulo2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor1 = valor.nextDouble();

        if (valor1 >= 1000.00 && valor1 <= 5000.00) {
            System.out.println("O valor "+valor1+", é um permitido para empréstimo.");
        } else {
            System.out.println("O valor "+valor1+", não está dentro do intervalo permitido para empréstimo. ");

        }
    }
}
