package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GlobalUtilsTest {

    @Test
    @DisplayName("공백 제거 테스트")
    public void removeSpaceTest() {
        // given
        String target = "공 백 제 거 테스 트 입 니 다.";

        // when
        final String expect = GlobalUtils.removeAllSpace(target);

        // then
        String wannabe = "공백제거테스트입니다.";
        Assertions.assertEquals(wannabe, expect);
    }

    @Test
    @DisplayName("스플릿 메서드 테스트")
    public void splitWithChar() {
        String target = "A,y,a,a,n,";
        String criteria = ",";
        final String[] result = GlobalUtils.splitWithCriteria(criteria, target);

        final boolean equals = Arrays.equals(result, new String[]{"A", "y", "a", "a", "n"});

        Assertions.assertTrue(equals);
    }
}
