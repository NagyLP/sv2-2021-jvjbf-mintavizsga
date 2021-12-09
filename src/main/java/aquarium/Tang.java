package aquarium;

public class Tang extends Fish {

    public Tang(String name, double weight, String color) {
        super(name, weight, color, true);
    }

    @Override
    public void feed() {
        incrementWeight(+1);
    }
}
