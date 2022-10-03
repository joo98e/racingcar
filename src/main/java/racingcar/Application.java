package racingcar;

import utils.GlobalUtils;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("차의 이름 입력 (이름은 5자 이하, 콤마로 구분)");
        String initialValue = GlobalUtils.removeAllSpace(scanner.nextLine());

        System.out.println("시도할 회수를 입력하세요.");
        int initialLabValue = scanner.nextInt();

        final String[] splitter = GlobalUtils.splitWithCriteria(",", initialValue);

        Race race = new Race(splitter, initialLabValue);

        System.out.println(race.getCars());
    }
}
