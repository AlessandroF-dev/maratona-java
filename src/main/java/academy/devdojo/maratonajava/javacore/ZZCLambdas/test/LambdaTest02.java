package academy.devdojo.maratonajava.javacore.ZZCLambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> strings = List.of("Naruto", "Goku");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> map = map(strings, String::toUpperCase); //com metodo reference
        System.out.println(integers);
        System.out.println(map);
    }
    private static <T, R> List<R> map (List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
