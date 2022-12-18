package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado"); // mapeando através de chave e valor
        map.put("mouze", "mouse");
        map.putIfAbsent("vc", "você2"); // mapear caso não exista
        System.out.println(map);
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("------------------");
        for (String value : map.keySet()){
            System.out.println(value);
        }
        System.out.println("------------------");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getKey());
        }
    }
}
