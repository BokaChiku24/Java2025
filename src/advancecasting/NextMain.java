package advancecasting;

public class NextMain {

    public static void main(String[] args) {

        Movie3 movie = Movie3.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure3 jaws = (Adventure3) Movie3.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie3.getMovie("C", "Airplane");
        Comedy3 comedyMovie = (Comedy3) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie3.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy3("Airplane");
        plane.watchComedy();
    }
}
