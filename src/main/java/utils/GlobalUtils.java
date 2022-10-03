package utils;

public class GlobalUtils {
    public static String removeAllSpace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static String[] splitWithCriteria(String criteria, String target) {
        return target.split(criteria);
    }

    public static void printErrorMessage(String message) {
        System.out.println("[ERROR] " + message);
    }
}






