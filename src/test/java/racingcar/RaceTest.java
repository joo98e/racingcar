package racingcar;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}