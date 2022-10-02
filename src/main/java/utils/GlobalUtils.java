package utils;

public class GlobalUtils {
    public static String removeAllSpace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static String[] splitWithChar(String criteria, String target) {
        return target.split(criteria);
    }
}






