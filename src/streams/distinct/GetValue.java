package streams.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetValue {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,2,5,8,9,9,5,4,7,4,7,9,0,10,2,1,10);
        List<Integer> sortedValues = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedValues.get(3));
    }
}
