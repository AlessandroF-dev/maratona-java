package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonEager.getInstance());
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getInstance();
        System.out.println(airCraftSingletonEager.bookSeat(seat));
    }
}
