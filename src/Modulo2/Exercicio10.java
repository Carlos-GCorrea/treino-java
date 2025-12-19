package Modulo2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a senha de acesso: ");
        String senha = ler.nextLine();
        System.out.println("Digite o nível de acesso: ");
        String nvAcesso = ler.nextLine();

        if (!senha.equals("2023") && !nvAcesso.equals("2")) {
            System.out.println("Dados incorretos!");
        } else if (!nvAcesso.equals("2")) {
            System.out.println("Nível de acesso incorreto para a senha");
        } else if (!senha.equals("2023")) {
            System.out.println("Senha incorreta!");
        } else {
            System.out.println("Acesso liberado!");
        }
    }
}
