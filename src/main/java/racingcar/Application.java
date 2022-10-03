package racingcar;

import utils.GlobalUtils;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("차의 이름 입력 (이름은 5자 이하, 콤마로 구분)");

        String initialValue = GlobalUtils.removeAllSpace(scanner.nextLine());

        final String[] splitter = GlobalUtils.splitWithCriteria(",", initialValue);

        Race race = new Race();
        race.initialize(splitter);
        race.addCarByName("asd-fa");

        final List<Car> cars = race.getCars();
        System.out.println(cars);

    }
}
