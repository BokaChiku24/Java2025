package advancecasting;

class ScienceFiction3 extends Movie3 {

    public ScienceFiction3(String title) {
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

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller!");
    }
}
