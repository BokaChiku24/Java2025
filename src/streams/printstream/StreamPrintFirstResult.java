package streams.printstream;

import java.util.stream.Stream;

public class StreamPrintFirstResult {
    // print only first result
    public static void main(String[] args) {
        Stream.of("Kunal", "Chavan", "Kunal", "King","ABc").filter(s->s.length()>4)
                .limit(1).forEach(s->System.out.println(s));
    }
}
