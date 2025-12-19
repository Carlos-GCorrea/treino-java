package Modulo2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String dia = sc.nextLine();

        if (dia.equals("sabado") || dia.equals("domingo")){
            System.out.println(dia+" não é um dia útil");
        } else if (dia.equals("segunda")|| dia.equals("terça") || dia.equals("quarta")
        || dia.equals("quinta") || dia.equals("sexta")){
            System.out.println(dia+" é um dia útil");
        } else {
            System.out.println("Dia inválido");
        }
    }
}
