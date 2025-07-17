package streams.streammap;

import java.util.stream.Stream;

public class StreamMap {
    // .map is used to apply filert n the filter result
    public static void main(String[] args) {
        Stream.of("Kunal", "Chavan", "Kunal", "King","ABc").filter(k->k.endsWith("l"))
                .map(k -> k.toUpperCase()).forEach(k-> System.out.println(k));
    }
}
