package racingcar;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CarFactoryTest {

    @Test
    @DisplayName("Car initialize Test")
    void createByNames() {
        // given
        List<String> names = Arrays.asList("car", "bar", "var", "far", "gar");

        // when
        final CarFactory carFactory = new CarFactory();
        final List<Car> createdByNames = carFactory.createByNames(names);

        // then
        Assertions.assertThat(createdByNames.get(0).getName()).isEqualTo("car");
        Assertions.assertThat(createdByNames.get(0).getName()).isEqualTo("bar");
        Assertions.assertThat(createdByNames.get(0).getName()).isEqualTo("var");
        Assertions.assertThat(createdByNames.get(0).getName()).isEqualTo("far");
        Assertions.assertThat(createdByNames.get(0).getName()).isEqualTo("gar");

    }

    @Test
    @DisplayName("")
    void names() {
        // given

        // when

        // then

    }

}