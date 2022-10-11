package racingcar;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RaceTest {

    @Test
    @DisplayName("updateStatus 테스트")
    void names() {
        // given
        final Car a = new Car("a");
        final Car b = new Car("b");
        final Car c = new Car("c");

        // when
        a.randomMove();
        b.randomMove();
        c.randomMove();

        // then
        Assertions.assertThat(a.getPosition()).isEqualTo(1);
        Assertions.assertThat(b.getPosition()).isEqualTo(0);
        Assertions.assertThat(c.getPosition()).isEqualTo(1);

        // when2
        a.randomMove();
        b.randomMove();
        c.randomMove();

        // then2
        Assertions.assertThat(a.getPosition()).isEqualTo(2);
        Assertions.assertThat(b.getPosition()).isEqualTo(1);
        Assertions.assertThat(c.getPosition()).isEqualTo(1);

        // when3
        a.randomMove();
        b.randomMove();
        c.randomMove();

        // then3
        Assertions.assertThat(a.getPosition()).isEqualTo(3);
        Assertions.assertThat(b.getPosition()).isEqualTo(2);
        Assertions.assertThat(c.getPosition()).isEqualTo(2);

    }

    @Test
    @DisplayName("race get all position values")
    void getAllPositionByCars() {
        // given
        final List<Car> cars = Arrays.asList(new Car("a"), new Car("b"), new Car("c"));
        final Race race = new Race(cars, 3);

        cars.get(0).setPosition(3);
        cars.get(1).setPosition(2);
        cars.get(2).setPosition(4);

        // when
        final List<Integer> allPositionByCars = race.getAllPositionByCars(race.cars);

        // then
        Assertions.assertThat(allPositionByCars).isEqualTo(Arrays.asList(3, 2, 4));

    }


}