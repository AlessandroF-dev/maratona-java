package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonEager {
    //Eager initialization
    private static final AirCraftSingletonEager INSTANCE = new AirCraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;


    public static AirCraftSingletonEager getInstance(){
        return INSTANCE;
    }

    private AirCraftSingletonEager (String name){
        this.name = name;
    }
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public boolean bookSeat (String seat){
        return availableSeats.remove(seat);
    }
}
