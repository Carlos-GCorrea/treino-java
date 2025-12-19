package Modulo2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = n1.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = n1.nextInt();

        if (num1 > num2) {
            System.out.println("Número " + num1 + " maior que o numero " + num2);
        } else if (num2 > num1) {
            System.out.println("Número " + num2 + " maior que o numero " + num1);
        }else {
            System.out.println("Números são iguais");
        }
    }
}
