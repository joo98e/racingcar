package racingcar;

import utils.StringUtils;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final CarFactory carFactory = new CarFactory();
        final Race race;

        final List<String> splitter;
        final List<Car> cars;

        final String initialValue;
        final int tryCount;

        System.out.println("차의 이름 입력 (이름은 5자 이하, 콤마로 구분, 공백은 취급하지 않음)");
        initialValue = StringUtils.removeAllSpaces(scanner.nextLine());

        System.out.println("시도할 회수를 입력하세요.");
        tryCount = scanner.nextInt();

        splitter = StringUtils.splitByComma(initialValue);
        cars = carFactory.createByNames(splitter);

        System.out.println("===========================");
        cars.forEach((car) -> {
            System.out.println("생성된 차 이름 : " + car.getName());
        });
        System.out.println("===========================");

        System.out.println("경주를 시작합니다.");
        race = new Race(tryCount);
        race.setCars(cars);


    }
}
