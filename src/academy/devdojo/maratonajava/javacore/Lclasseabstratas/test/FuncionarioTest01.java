package academy.devdojo.maratonajava.javacore.Lclasseabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alessandro", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alessandro", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        gerente.imprime();


    }/** 84 - Orientação Objetos - Classes abstratas pt 01
     *- Classes abstratas são classes que não podem ser instânciadas, ou seja, classe
     * que não será possível (ou nem tentaria) criar objetos dela, diretamente. Também
     * podemos se referir a estas classes como superclasses abstratas. Sendo utilizada como modelo
     * para que outras classes herdem atributos, métodos e propiedades dela.
     *
     * - No caso do exemplo acima, nós não podemos ter uma instância do objeto Funcionario,
     * pois esta é uma classe abstrata, assim podemos somente utilizar instânciando
     * algum objeto que extenda as funcionalidades de funcionario, que nesse caso é o
     * objeto Gerente e Desenvolvedor.
     *
     * - Classes abstratas não podem ser instânciadas, mas apenas extendidas.
     * - Métodos abstratos não possuem corpo, apenas são sobrescritos.
     * - Classes abstratas podem possuir métodos abstratos e concretos.
     * - Métodos abstratos não podem existir em classes concretas.
     *
     * - Podemos criar um método abstrato em uma classe abstrata para obrigar todas as
     * classes extendidas a implementar os métodos, assim não importa quantas classes
     * extendam todas deveram ter um método específico, como um método de bonus (comissão),
     * onde gerente, desenvolvedor, marketing etc... teram que ter esse método bonus, porém
     * cada um com uma condição especial, caso alguns tenham um bonus maior do que o outro.
     */
}

