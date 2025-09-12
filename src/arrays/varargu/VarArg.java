package arrays.varargu;

import java.util.Arrays;

public class VarArg {
    public static void main(String... args) {
        System.out.println("Hello World Again" + "\n");

        String[] splitString = "Hello World Again".split(" ");
        printText(splitString);

        System.out.println("-".repeat(30));
        printText("Hello");

        System.out.println("-".repeat(30));
        printText("Hello","World","Again");

        String[] sArray = {"1st", "2nd", "3rd", "4th","5th"};
        System.out.println((Arrays.asList(String.join(",",sArray))));
    }

    private static void printText(String... textList){
        for(String string : textList){
            System.out.println(string);
        }
    }
}
