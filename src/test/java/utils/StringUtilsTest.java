package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class StringUtilsTest {

    @Test
    @DisplayName("공백 제거 테스트")
    void removeAllSpaces() {
        // given
        String string = "a,m a ,a";

        // when
        final String result = StringUtils.removeAllSpaces(string);

        // then
        Assertions.assertThat(result).isEqualTo("a,ma,a");

    }

    @Test
    @DisplayName("Split By DELEMETER(Comma)")
    void names() {

        String example1 = "1,2,3,4,5";
        final List<String> nonSpace = StringUtils.splitByComma(example1);
        Assertions.assertThat(nonSpace).isEqualTo(Arrays.asList("1", "2", "3", "4", "5"));

    }
}