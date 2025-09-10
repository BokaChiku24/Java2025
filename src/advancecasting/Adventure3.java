package advancecasting;

public class Adventure3 extends Movie3 {

    public Adventure3(String title) {
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

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}
