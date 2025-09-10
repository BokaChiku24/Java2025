package oops.polymorphism.moviepolymorphism;

public class Main {
   public  static void main(String[] args) {
        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();

       Movie theAdventureMovie = new Adventure("Scary Movie");
       theAdventureMovie.watchMovie();

       Movie theComedyMovie = new Comedy("Hera There");
       theComedyMovie.watchMovie();

       Movie theScienceMovie = new ScienceFiction("Interstellar");
       theScienceMovie.watchMovie();
    }
}
