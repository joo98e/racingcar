package utils;

import java.util.Arrays;
import java.util.List;

public class StringUtils {

    public static final String DELEMETER_COMMA = ",";

    public static List<String> splitByComma(String string) {
        return Arrays.asList(string.split(DELEMETER_COMMA));
    }

    public static String removeAllSpaces(String string) {
        return string.replaceAll("\\s", "");
    }

    public static StringBuilder convertTyphoonByNumber(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append("-");
        }
        return result;
    }
}
