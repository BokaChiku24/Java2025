package streams.sorted;

import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Kunal","Sanjay","Chavan","ABCDS","Kkuisgd");
        name.stream().filter(k -> k.startsWith("K")).sorted()
                .map(k -> k.toUpperCase()).forEach(k -> System.out.println(k));
    }
}
