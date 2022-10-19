package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 12000);
        Tomate tomate = new Tomate("Tomate velho", 10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
