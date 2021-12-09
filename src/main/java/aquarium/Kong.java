package aquarium;

public class Kong extends Fish {

    public Kong(String name, double weight, String color) {
        super(name, weight, color, false);
    }

    @Override
    public void feed() {
        incrementWeight(+2);
    }
}
