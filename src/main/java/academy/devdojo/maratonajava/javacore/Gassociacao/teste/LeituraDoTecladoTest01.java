package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("------------------");

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Sexo: "+ sexo);

    }
    /** 68 - Orientação Objetos - Leitura de dados pelo console
     * - A classe Scanner do java.util é utilizada para obter a entrada dos
     * tipos primitivos como int, double, char. É a maneira mais fácil de ler a
     * entrada em um programa em java.
     *
     * - Para utilizar é preciso instanciar um novo objeto Scanner scanner = new
     * e passando no construtor (System.in)
     *
     * - Utilizando a váriavel de referência do objeto instânciado, basta dar um .
     * para ver todos as suas opções, sendo mais usado o .next.
     *
     * - Funções do next.
     * vazio     - next(); imprime em String somente a primeira palavra ou letra digitada
     * linha completa - nextLine(); imprime a linha inteira digitada
     * retorna um Integer - nextInt(); imprime o valor int digitado
     * tipo primitivo char - next().charAt(0); imprime o char através da letra digitada,
     * pois através do charAt(0) estamos fazendo referência para a primeira letra da
     * linha, assim pode ser digitado Masculino ou Feminino, não apenas as primeiras letras
     * */
}
