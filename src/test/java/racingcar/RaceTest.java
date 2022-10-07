package racingcar;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RaceTest {

    @Test
    @DisplayName("Race tryCount 테스트")
    void tryCount() {
        // given
        final Race race = new Race(5);

        // when
        final int tryCount = race.getTryCount();

        // then
        Assertions.assertThat(tryCount).isEqualTo(5);
    }

    @Test
    @DisplayName("updateStatus 테스트")
    void names() {
        // given
        final Car a = new Car("a");
        final Car b = new Car("b");
        final Car c = new Car("c");

        // when
        a.updateStatus(5);
        b.updateStatus(3);
        c.updateStatus(9);

        // then
        Assertions.assertThat(a.getPosition()).isEqualTo(1);
        Assertions.assertThat(b.getPosition()).isEqualTo(0);
        Assertions.assertThat(c.getPosition()).isEqualTo(1);

        // when2
        a.updateStatus(4);
        b.updateStatus(9);
        c.updateStatus(0);

        // then2
        Assertions.assertThat(a.getPosition()).isEqualTo(2);
        Assertions.assertThat(b.getPosition()).isEqualTo(1);
        Assertions.assertThat(c.getPosition()).isEqualTo(1);

        // when3
        a.updateStatus(9);
        b.updateStatus(9);
        c.updateStatus(8);

        // then3
        Assertions.assertThat(a.getPosition()).isEqualTo(3);
        Assertions.assertThat(b.getPosition()).isEqualTo(2);
        Assertions.assertThat(c.getPosition()).isEqualTo(2);

    }

    @Test
    @DisplayName("race get all position values")
    void getAllPositionByCars() {
        // given
        final Race race = new Race(3);
        final Car a = new Car("a");
        final Car b = new Car("b");
        final Car c = new Car("c");
        a.setPosition(3);
        b.setPosition(2);
        c.setPosition(4);

        race.setCars(Arrays.asList(a, b, c));

        // when
        final List<Integer> allPositionByCars = race.getAllPositionByCars(race.cars);

        // then
        Assertions.assertThat(allPositionByCars).isEqualTo(Arrays.asList(3, 2, 4));

    }


}