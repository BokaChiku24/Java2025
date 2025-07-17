package streams.arraylisttostream;

import java.util.ArrayList;
import java.util.List;

public class RegularStream {
    // count the number of names starting with alphabet K in the list
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Kunal");
        names.add("Chavan");
        names.add("Kunal");
        names.add("King");
        // there is no life for intermediate operations if there is no terminal operation
        // if terminal operation will execute only if intermmediate operation (filter) returns true
        Long count = names.stream().filter(s -> s.startsWith("K")).count();
        System.out.println(count);
    }
}
