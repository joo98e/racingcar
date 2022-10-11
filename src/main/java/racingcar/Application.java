package racingcar;

import exception.carExceptionHandler.CarException;
import utils.StringUtils;
import view.Viewer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // initialize
        final Scanner scanner = new Scanner(System.in);
        final CarFactory carFactory = new CarFactory();

        // input value
        Viewer.printMessage("차의 이름 입력 (이름은 5자 이하, 콤마로 구분, 공백은 취급하지 않음)");
        final String initialValue = StringUtils.removeAllSpaces(scanner.nextLine());

        Viewer.printMessage("시도할 회수를 입력하세요.");
        final int tryCount = scanner.nextInt();

        List<Car> cars = new ArrayList<>(); // 👎

        // logic
        try {
            List<String> splitter = StringUtils.splitByComma(initialValue);
            cars = carFactory.createByNames(splitter);
        } catch (CarException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        Race race = new Race(cars, tryCount);

        Viewer.printMessage("경주를 시작합니다.");
        race.racing();

        final List<Car> winners = race.getWinners();
        Viewer.printMessage("완승한 Car는 " + race.getWinnersName(winners) + " 입니다.");
    }

}
