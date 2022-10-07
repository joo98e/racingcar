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
        Assertions.assertThat(createdByNames.get(1).getName()).isEqualTo("bar");
        Assertions.assertThat(createdByNames.get(2).getName()).isEqualTo("var");
        Assertions.assertThat(createdByNames.get(3).getName()).isEqualTo("far");
        Assertions.assertThat(createdByNames.get(4).getName()).isEqualTo("gar");

    }

    @Test
    @DisplayName("공백으로 들어오는 생성자는 무시")
    void names() {
        // given
        final List<String> list = Arrays.asList(" ", "1", "2", "");

        // when
        final CarFactory carFactory = new CarFactory();
        final List<Car> result = carFactory.createByNames(list);

        System.out.println(result.size());
        // then
        Assertions.assertThat(result.size()).isEqualTo(2);

        Assertions.assertThat(result.get(0).getName()).isEqualTo("1");
        Assertions.assertThat(result.get(1).getName()).isEqualTo("2");
    }
}