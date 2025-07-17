package streams.arraylisttostream;

import java.util.ArrayList;
import java.util.List;

public class Regular {
    // count the number of names starting with alphabet K in the list
    public static void main(String[] args) {
        int alphabetCount = 0;
        List<String> names = new ArrayList<String>();
        names.add("Kunal");
        names.add("Chavan");
        names.add("Kunal");
        names.add("King");

        // list iterations
        for(int i = 0; i< names.size(); i++){
            String actualName = names.get(i);
            if(actualName.startsWith("K")){
                alphabetCount++;
            }
        }
        System.out.println("Total count of K is " + alphabetCount);
    }
}
