package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");

        System.out.println(AirCraftSingletonLazy.getInstance());
        System.out.println(AirCraftSingletonLazy.getInstance());
        Constructor<AirCraftSingletonLazy> constructor = AirCraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AirCraftSingletonLazy airCraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(airCraftSingletonLazy);

    }

    private static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonLazy.getInstance());
        AirCraftSingletonLazy airCraftSingletonLazy = AirCraftSingletonLazy.getInstance();
        System.out.println(airCraftSingletonLazy.bookSeat(seat));
    }
}
