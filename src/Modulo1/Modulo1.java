package Modulo1;

public class Modulo1 {
    public static void main(String[] args) {

        //Testes
        int quantidadePassos = 500;
        double alturaEmMetros = 2.50;

        Paciente Jose = new Paciente();

        int alturaEmCentimetro = (int)(alturaEmMetros * 100);
        System.out.println(alturaEmCentimetro);

        //Exercício1
        String Nome = "Maria";
        int Idade = 25;
        double Altura = 1.68;
        boolean Estudante = true;

        System.out.println(Nome + " " + Idade + " " + Altura + " " + Estudante);

        //Exercicio2
        double valorDouble = 19.5;
        System.out.println((int)valorDouble);

        //Exercicio3
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        System.out.println("A média das notas é: "+(nota1 + nota2 + nota3)/3);

        //Exercicio4
        int celsius = 40;

        int Fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é: " + Fahrenheit);

        //Exercicio5

        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int paginas = 96;
        double preco = 39.90;
        Categoria categoria = Categoria.F;

        LivroE5 livro = new LivroE5(titulo, autor, paginas, preco, Categoria.F);


        String categoriaDescricao;

        if (categoria == Categoria.F) {
            categoriaDescricao = "Ficção";
        } else if (categoria == Categoria.N) {
            categoriaDescricao = "Não-ficção";
        } else if (categoria == Categoria.T) {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == Categoria.H) {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Modulo1.Categoria inválida";
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");

        //Exercicio6
        double precoLoja = 300.0;

        if(precoLoja <= 50.0){
            System.out.println("Preço bom");
        } else if (precoLoja > 50.0 && precoLoja <= 200.0) {
            System.out.println("Preço Intermediário");
        } else{
            System.out.println("Preço Premium Deluxe");
        }

        //Exercicio7
        int numero = 9;

        int sobra = numero % 2;

        if(sobra == 0){
            System.out.println("Número par");
        }else {
            System.out.println("Número ímpar");
        }

        //Exercicio8
        double valorReais = 451.50;

        double valorEmDolar = valorReais / 5.25;

        System.out.println("Valor dolar: " + valorEmDolar);

        //Exercicio9

        int idade = 17;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        //Exercicio10

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
        }
    }
}
