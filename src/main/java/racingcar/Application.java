package racingcar;

import utils.StringUtils;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("차의 이름 입력 (이름은 5자 이하, 콤마로 구분)");
        String initialValue = StringUtils.removeAllSpaces(scanner.nextLine());
        System.out.println("시도할 회수를 입력하세요.");
        int initialLabValue = scanner.nextInt();


        final List<String> splitter = StringUtils.splitByComma(initialValue);
        final CarFactory carFactory = new CarFactory();
        carFactory.createByNames(splitter);

        Race race = new Race(initialLabValue);

    }
}
