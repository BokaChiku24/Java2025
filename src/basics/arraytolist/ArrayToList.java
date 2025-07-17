package basics.arraytolist;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args){
        String name[] = new String[5];
        name[0] = "Ab";
        name[1] = "cd";
        name[2] = "ef";
        name[3] = "gh";
        name[4] = "ik";
        List<String> list = Arrays.asList(name);
        System.out.println(list);
    }
}
