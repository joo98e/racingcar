package racingcar;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarTest {

    @Test
    @DisplayName("[정상 문자열] Car 생성 테스트")
    public void generateCarInstanceByScannerString (){
        String string = "car, test, generate, instance, scanner";

        final String[] split = string.split(",");
        
        System.out.println(Arrays.toString(split));
    }
}