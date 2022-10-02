package racingcar;

import utils.GlobalUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("차의 이름 입력 (이름은 5자 이하, 콤마로 구분)");

        String initialValue = GlobalUtils.removeAllSpace(scanner.nextLine());

        final String[] splitted = GlobalUtils.splitWithChar(",", initialValue);


        Arrays.stream(splitted).map()
    }
}
