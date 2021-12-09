package aquarium;

public abstract class Fish {

    private final String name;
    private double weight;
    private String color;
    private final boolean memoryLoss;

    public abstract void feed();

    protected Fish(String name, double weight, String color, boolean memoryLoss) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.memoryLoss = memoryLoss;
    }

    public void incrementWeight(int increment) {
        weight += increment;
    }

    public String getStatus() {
        return String.format("%s, weight: %d, color: %s, short-term memory loss: %s",
                name, weight, color, memoryLoss);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
}
