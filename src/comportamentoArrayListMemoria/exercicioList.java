package comportamentoArrayListMemoria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercicioList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Alex");
        list.add("Bob");
        list.add("Mario");
        list.add("Mauricio");
        list.add("Luiz");
        list.add("Ezequiel");
        list.add(2, "Malaquias");


        for(String x: list){
            System.out.println(x);
        }

        System.out.println("========================================");
        list.removeIf(x-> x.charAt(0) == 'E');

        for(String x: list){
            System.out.println(x);
        }

        List<String> result = list.stream().filter(x-> x.charAt(0) == 'M').collect(Collectors.toList());

        System.out.println("------------------");

        String name = list.stream().filter(x->x.charAt(0) == 'M').findFirst().orElse(null);

        System.out.println(name);
    }
}
