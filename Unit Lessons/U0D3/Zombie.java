public class Zombie {
    // instance variables (attributes)
    // green
    String skinColor = "Green";
    // rot and dead
    boolean isDead = true;

    // humans eaten count
    int humansEaten = 60;

    // main
    public static void main(String[] args) {
        Zombie phillip = new Zombie();

        System.out.println(phillip.growl());
        System.out.println(phillip.humansEaten());

        Zombie brian = new Zombie();

        System.out.println(brian.growl());

        System.out.println(brian.humansEaten);
        brian.eatHuman();
        System.out.println(brian.humansEaten);
        brian.feast(14);
        System.out.println(brian.humansEaten);
    }

    // methods (behaviors)

    // growl
    public String growl() {
        return "grrrsssaaaaajlhhhhh...";
    }

    public int humansEaten() {
        return humansEaten;
    }

    public void eatHuman() {
        humansEaten++;
    }

    public void feast(int humanCount) {
        humansEaten += humanCount;
    }
}
