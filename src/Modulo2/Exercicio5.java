package Modulo2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        Double valor = entrada.nextDouble();
        Double desconto = valor * 0.10;

        if (valor >= 100.00) {
            valor = valor - desconto;
            System.out.println("Desconto de 10% aplicado. \n" + "Valor da compra: " + valor);
        } else {
            System.out.println("Nenhum desconto aplicado. \n" + "Valor da compra: " + valor);
        }
    }
}
