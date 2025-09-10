package oops.instanceofkeyword;

public class NextMain4 {

    public static void main(String[] args) {

        Movie4 movie = Movie4.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure4 jaws = (Adventure4) Movie4.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie4.getMovie("C", "Airplane");
        Comedy4 comedyMovie = (Comedy4) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie4.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy4("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie4.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy4 c = (Comedy4) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure4) {
            ((Adventure4) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction4 syfy) {
            syfy.watchScienceFiction();
        }
    }
}
