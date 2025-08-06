package string.stringparsing;

public class Parsing {
    public static void main(String[] args) {
        String currentYear = "2025";
        String userDateBirthYear = "1990";
        String userAgeWithPartialYear = "22.5";
        System.out.println(STR."Age is =  \{(parseString(currentYear) - parseString(userDateBirthYear))}");
        System.out.println(STR."User is saying his age is = \{Double.parseDouble(userAgeWithPartialYear)}");
    }

    public static int parseString(String input){
        return Integer.parseInt(input);
    }
}
