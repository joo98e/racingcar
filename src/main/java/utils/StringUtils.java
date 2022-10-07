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
}
