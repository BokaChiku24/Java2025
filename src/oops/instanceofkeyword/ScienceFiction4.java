package oops.instanceofkeyword;

class ScienceFiction4 extends Movie4 {

    public ScienceFiction4(String title) {
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
