package racingcar;


import exception.carExceptionHandler.CarException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    @DisplayName("차의 이름은 5자 이어야 한다.")
    void carNameLimitedLength() {
        String string = "차의이름은5글자이하";
        Assertions.assertThatExceptionOfType(CarException.class).isThrownBy(() -> new Car(string)).withMessage("[ERROR] 이름은 5자 이하이어야 합니다.");
    }


}