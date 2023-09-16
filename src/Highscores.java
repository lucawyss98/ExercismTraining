import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class HighScores {
    private List<Integer> hs;

    public HighScores(List<Integer> highScores) {
        this.hs = highScores;
    }

    List<Integer> scores() {
        return hs;
    }

    Integer latest() {
        return hs.get(hs.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(hs);
    }

    List<Integer> personalTopThree() {

        List<Integer> copyList = new ArrayList<>(hs);
        Collections.sort(copyList, Collections.reverseOrder());

        return copyList.subList(0, Math.min(3, copyList.size()));
    }
}
