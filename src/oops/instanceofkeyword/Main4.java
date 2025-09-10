package oops.instanceofkeyword;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie4 movie = Movie4.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
