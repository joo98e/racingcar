package racingcar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.GlobalUtils;

public class CarTest {

    @Test
    @DisplayName("[Car] - Car 반복 생성")
    public void generateCarInstanceByScannerString() {
        String string = "car, test, generate, instance, scanner";

        final String[] split = GlobalUtils.removeAllSpace(string).split(",");

        final String[] expect = new String[]{"car", "test", "generate", "instance", "scanner"};
        Assertions.assertArrayEquals(split, expect);


    }
}