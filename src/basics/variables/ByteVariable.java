package basics.variables;

public class ByteVariable {
    public static void main(String[] args) {
        byte myByteNumber = 10;
        System.out.println("My byte number is: " + myByteNumber);
        byte myMaxByteNumber = Byte.MAX_VALUE;
        byte myMinByteNumber = Byte.MIN_VALUE;
        System.out.println("Byte range is: " + myMaxByteNumber + " to "+ myMinByteNumber);
    }
}
