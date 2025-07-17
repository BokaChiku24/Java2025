package streams.concat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatenation {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Kunal");
        names.add("Chavan");
        names.add("Kunal");
        names.add("King");
        List<String> newNames = Arrays.asList("James", "Bond", "Rock", "Adam", "Raghav");
        // merging two different list
        Stream<String> concat = Stream.concat(names.stream(),newNames.stream());
        concat.forEach(k -> System.out.println(k));
        System.out.println("***************************************");
        // once stream is modified we can not use the same stream
        // sorting order
        Stream<String> concat2 = Stream.concat(names.stream(),newNames.stream());
        concat2.sorted().forEach(k -> System.out.println(k));
    }
}
