package basics.defaultdatatype;

public class DoubleExample {
    public static void main(String[] args) {
        float myFloatNumber = 3.14f;
        // Here myFloatNumber is by default is in double
        // System.out.println("Double number is: " + myFloatNumber);
        // java: incompatible types: possible lossy conversion from double to float
        System.out.println("Double number is: " + (double) myFloatNumber);
    }
}
