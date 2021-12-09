package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OwlCounter {

    private List<String> owlList;

    public void readFromFile(Path path) {
        try {
            owlList = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.");
        }
    }

    public int getNumberOfOwls(String country) {
        for (String fileLine : owlList) {
            if (fileLine.startsWith(country)) {
                return Integer.parseInt(fileLine.split("=")[1]);
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int sumAllOwls = 0;
        for(String item : owlList) {
            sumAllOwls += Integer.parseInt(item.split("=")[1]);
        }
        return sumAllOwls;
    }

}
