package basics.casting;

public class ShortCasting {
    public static void main(String[] args) {
        int myIntNumber = Integer.MAX_VALUE;
        short myShortNumber = (short) (myIntNumber / 2);
        System.out.println("Short number is:" + myShortNumber);
    }
}
