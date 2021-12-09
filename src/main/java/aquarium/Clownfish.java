package aquarium;

public class Clownfish extends Fish {

    public Clownfish(String name, double weight, String color) {
        super(name, weight, color, false);
    }

    @Override
    public void feed() {
        incrementWeight(+1);
    }
}
