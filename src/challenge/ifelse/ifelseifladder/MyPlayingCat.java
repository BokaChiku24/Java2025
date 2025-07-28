package challenge.ifelse.ifelseifladder;

public class MyPlayingCat {

    private final static boolean CAT_PLAYING = true;
    private final static boolean CAT_NOT_PLAYING = false;

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true
        System.out.println(isCatPlaying(false, 25)); // true
        System.out.println(isCatPlaying(true, 45));  // true
        System.out.println(isCatPlaying(true, 46));  // false
        System.out.println(isCatPlaying(false, 46)); // false
        System.out.println(isCatPlaying(false, 24)); // false
        System.out.println(isCatPlaying(true, 24));  // false
        System.out.println(isCatPlaying(true, 35));  // true
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return CAT_PLAYING;
        } else if (!summer && (temperature >= 25 && temperature < 36)) {
            return CAT_PLAYING;
        } else {
            return CAT_NOT_PLAYING;
        }
    }
}
