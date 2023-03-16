package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(100000, 2);

        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros(5,2));
        System.out.println("\n------------");
        calculadora.imprimeDivisaoDeDoisNumeros(3, 1);
    }
}
