package oops.instanceofkeyword;

class Comedy4 extends Movie4 {

    public Comedy4(String title) {
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

    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}
