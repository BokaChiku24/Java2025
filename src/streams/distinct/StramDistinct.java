package streams.distinct;

import java.util.Arrays;
import java.util.List;

public class StramDistinct {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,2,5,8,9,9,5,4,7,4,7,9,0,10,2,1,10);
        values.stream().distinct().sorted().forEach(k->System.out.println(k));
    }
}
