package basics.consoleinput;

public class Console {
    public static void main(String[] args) {
        System.out.println(getInputFromConsole());
    }

    public static String getInputFromConsole(){
        String name = System.console().readLine("Enter your name: ");
        System.out.println( "Hi " + name + ", Thanks for entering your name!");
        int age = Integer.parseInt(System.console().readLine("Enter your age: "));
        System.out.println( "Your age is " + age + " years old.");
        return "Hi " + name + "! Your age is " + age + ".";
    }

}
