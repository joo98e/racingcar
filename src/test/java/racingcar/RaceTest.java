package racingcar;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.GlobalUtils;

public class RaceTest {

    @Test
    @DisplayName("Race")
    public void generateCarInstanceByScannerString() {
        String initialScanInputValue = "car,test,hwang,jeong,going";

        final String[] split = GlobalUtils.splitWithCriteria(",", initialScanInputValue);

        final Race race = new Race(split, 5);

        System.out.println(race.getCars());
    }
}