package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList();
        lista.add("Naruto");
        lista.add("Gaara");

        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Goku"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
