package oops.polymorphism.moviepolymorphism;

public class Movie2 {

    private String title;

    public Movie2(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie2 getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure2(title);
            case 'C' -> new Comedy2(title);
            case 'S' -> new ScienceFiction2(title);
            default -> new Movie2(title);
        };
    }
}

class Adventure2 extends Movie2 {

    public Adventure2(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy2 extends Movie2 {

    public Comedy2(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}

class ScienceFiction2 extends Movie2 {

    public ScienceFiction2(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}
