package streams.streamlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {
        int alphabetCount = 0;
        List<String> names = new ArrayList<String>();
        names.add("Kunal");
        names.add("Chavan");
        names.add("Kunal");
        names.add("King");
        // there is no life for intermediate operations if there is no terminal operation
        // if terminal operation will execute only if intermmediate operation (filter) returns true
        // create a stram list
        // how to use filter in stream API
        long count = Stream.of("Kunal", "Chavan", "Kunal", "King").filter(s -> {
            return s.startsWith("K");
        }).count();
        System.out.println(count);
    }
}
