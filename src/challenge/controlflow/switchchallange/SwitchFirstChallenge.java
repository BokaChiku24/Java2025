package challenge.controlflow.switchchallange;

public class SwitchFirstChallenge {
    public static void main(String[] args) {
        System.out.println(STR."\{getNATOEquivalent('C')}, \{getNATOEquivalent('A')}, \{getNATOEquivalent('R')}");
    }

    public static String getNATOEquivalent(char letter) {
        String natoEquivalent;
        switch (Character.toUpperCase(letter)) {
            case 'A':
                natoEquivalent = "Able";
                break;
            case 'B':
                natoEquivalent = "Baker";
                break;
            case 'C':
                natoEquivalent = "Charlie";
                break;
            case 'D':
                natoEquivalent = "Dog";
                break;
            case 'E':
                natoEquivalent = "Easy";
                break;
            case 'F':
                natoEquivalent = "Fox";
                break;
            case 'G':
                natoEquivalent = "George";
                break;
            case 'H':
                natoEquivalent = "How";
                break;
            case 'I':
                natoEquivalent = "Item";
                break;
            case 'J':
                natoEquivalent = "Jig";
                break;
            case 'K':
                natoEquivalent = "King";
                break;
            case 'L':
                natoEquivalent = "Love";
                break;
            case 'M':
                natoEquivalent = "Mike";
                break;
            case 'N':
                natoEquivalent = "Nan";
                break;
            case 'O':
                natoEquivalent = "Oboe";
                break;
            case 'P':
                natoEquivalent = "Peter";
                break;
            case 'Q':
                natoEquivalent = "Queen";
                break;
            case 'R':
                natoEquivalent = "Roger";
                break;
            case 'S':
                natoEquivalent = "Sugar";
                break;
            case 'T':
                natoEquivalent = "Tare";
                break;
            case 'U':
                natoEquivalent = "Uncle";
                break;
            case 'V':
                natoEquivalent = "Victor";
                break;
            case 'W':
                natoEquivalent = "William";
                break;
            case 'X':
                natoEquivalent = "X-ray";
                break;
            case 'Y':
                natoEquivalent = "Yoke";
                break;
            case 'Z':
                natoEquivalent = "Zebra";
                break;
            default:
                natoEquivalent = "Unknown";
                break;
        }
        return natoEquivalent;
    }
}
