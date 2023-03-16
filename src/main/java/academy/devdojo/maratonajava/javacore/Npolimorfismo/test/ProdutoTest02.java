package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("i7 ", 3000);

        Produto produto2 = new Tomate("Tomate grande ", 20);

        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");

        System.out.println(produto2.getValor());
        System.out.println(produto2.getNome());
        System.out.println(produto2.calcularImposto());
        System.out.println("-----------------");

        CalculadoraImposto.calcularImposto(tv);
    }
}
