package string.mutable;

public class StringBuilderClass {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(27));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(27));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder helloWorldBuilderPlus = new StringBuilder("Hello" + " World");
        helloWorldBuilderPlus.append(" and Goodbye");

        helloWorldBuilderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(helloWorldBuilderPlus);

        helloWorldBuilderPlus.reverse().setLength(7);
        System.out.println(helloWorldBuilderPlus);

    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());

    }
    public static void printInformation(StringBuilder stringBuilder){
        System.out.println("String = " + stringBuilder);
        System.out.println("Length = " + stringBuilder.length());
        System.out.println("Capacity = " + stringBuilder.capacity());

    }

}
