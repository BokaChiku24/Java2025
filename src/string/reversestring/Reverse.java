package string.reversestring;

public class Reverse {
    public static void main(String[] args) {
        String name = "Madam";
        String reversedName = "";
        for(int i = name.length()-1; i >=0; i--){
            System.out.print(name.charAt((i)));
            reversedName = name.charAt(i) + reversedName;
        }
        System.out.println((""));
        System.out.println("Reversed Name: " + reversedName);
        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("The given string is a palindrome.");
        }else{
            System.out.println("The given string is not a palindrome.");
        }
    }
}
