package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public static final int CAPACITY = 20;
    public static final int LIVING_SPACE = 5;
    private final List<Fish> fishList = new ArrayList<>();

    public void feed() {
        for (Fish item : fishList) {
            item.feed();
        }
    }

    public void addFish(Fish fish) {
        validateCapacity(fishList.size() + 1);
        fishList.add(fish);
    }

    private void validateCapacity(int numberOfFisch) {
        if (CAPACITY < numberOfFisch * LIVING_SPACE) {
            throw new IllegalStateException
                    ("Can not add fish because there is no more space.");
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> removeFishList = new ArrayList<>();
        for (Fish item : fishList) {
            if (item.getWeight() > maxWeight) {
                removeFishList.add(item);
            }
        }
        fishList.removeAll(removeFishList);
    }

    public List<String> getStatus() {
        List<String> fishStatus = new ArrayList<>();
        for (Fish item : fishList) {
            fishStatus.add(item.getStatus());
        }
        return fishStatus;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int memLossFishCount = 0;
        for (Fish item : fishList) {
            if (item.hasMemoryLoss())
                memLossFishCount++;
        }
        return memLossFishCount;
    }

//    private boolean isThereFishWithGivenColor(String color) {
//        if (fishList.contains(color)) {
//            return true;
//        }
//        return false;
//    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish item : fishList) {
            if (item.getColor().equals(color))
                return true;
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallestFish = fishList.get(0);
        for (Fish item : fishList) {
            if (item.getWeight() < smallestFish.getWeight() || smallestFish == null)
                smallestFish = item;
        }
        return smallestFish;
    }
}
