package Modulo2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

         Scanner ler = new Scanner(System.in);
         System.out.println("Digite o lado 1: ");
         int lado1 = ler.nextInt();
         System.out.println("Digite o lado 2: ");
         int lado2 = ler.nextInt();
         System.out.println("Digite o lado 3: ");
         int lado3 = ler.nextInt();

         if (((lado1+lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
             System.out.println("Os lados podem formar um triangulo");
         } else {
             System.out.println("Os lados não podem formar um triangulo");
         }
    }
}
