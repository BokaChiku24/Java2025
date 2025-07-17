package streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {
        // list
        // new list
        List<String> names = new ArrayList<String>();
        names.add("Kunal");
        names.add("Chavan");
        names.add("Kunal");
        names.add("King");
        List<String> newNames = Arrays.asList("James", "Bond", "Rock", "Adam", "Raghav");
        Stream<String> newStream = Stream.concat(names.stream(),newNames.stream());
        List<String> list = newStream.filter(k->k.equalsIgnoreCase("kUnal"))
                .sorted().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.get(1));

    }
}
