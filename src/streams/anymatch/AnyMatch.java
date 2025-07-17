package streams.anymatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatch {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Kunal");
        names.add("Chavan");
        names.add("Kunal");
        names.add("King");
        List<String> newNames = Arrays.asList("James", "Bond", "Rock", "Adam", "Raghav");
        Stream<String> newStream = Stream.concat(names.stream(),newNames.stream());
        boolean flag = newStream.anyMatch(k->k.equalsIgnoreCase("kUnal"));
        System.out.println(flag);
    }
}
