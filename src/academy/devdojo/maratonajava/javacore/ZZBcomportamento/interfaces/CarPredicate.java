package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);

    /** Lambdas = anonimas, funções, concíso
     * - (parametro) -> <expressão>
     * - (Car car) -> car.getColor().equals("green");
     * */
}
