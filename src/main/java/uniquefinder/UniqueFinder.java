package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String uniqueString) {

        if (uniqueString == null) {
            throw new IllegalArgumentException("Error, input field is null.");
        }

        List<Character> resultsList = new ArrayList<>();
        for (Character item : uniqueString.toCharArray()) {
            if (!resultsList.contains(item))
                resultsList.add(item);
        }
        return resultsList;
    }
}
