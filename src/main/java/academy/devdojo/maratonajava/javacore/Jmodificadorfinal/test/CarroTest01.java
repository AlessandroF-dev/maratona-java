package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        comprador2.setNome("Sandero");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }

    /** 77 - Orientação Objetos - Modificador final pt 01 - Tipo primitivo
     * - Em alguns casos pode ser que tenhamos atributos que não queremos que sejam alterados
     * como no exemplo acima, e para isso temos o modificador "final"
     *
     * - Modificador final, a instrução "final" indica que a classe, método ou variável
     * tem uma única atribuição que se mantém constante, assim não podendo ser alterada
     * no decorrer do processamento. Também não admite a criação de classes filhas. Na
     * programação isso se chama constante.
     *
     * - Para utilizar em um atributo por exemplo é preciso do modificador de acesso +
     * final + static + tipo + nome da variavel para atributo + valor (Ex = valor).
     * E por convenção escrevemos o nome da variávem em CAPSLOCK e palavras diferentes
     * separadas por um underline "_".
     */
}
