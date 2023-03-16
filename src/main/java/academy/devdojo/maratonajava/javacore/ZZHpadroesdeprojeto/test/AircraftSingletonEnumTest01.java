package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraftSingletonEnum = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraftSingletonEnum.bookSeat(seat));
    }
}
