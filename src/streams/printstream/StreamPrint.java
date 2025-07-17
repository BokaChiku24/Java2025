package streams.printstream;

import java.util.stream.Stream;

public class StreamPrint {
    public static void main(String[] args) {
        Stream.of("Kunal", "Chavan", "Kunal", "King","ABc").filter(s->s.length()>4)
                .forEach(s->System.out.println(s));
    }
}
