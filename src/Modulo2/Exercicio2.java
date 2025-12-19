package Modulo2;

public class Exercicio2 {
    public static void main(String[] args) {

        double media = 4.3;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media <= 6.9 && media >= 5.0) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
