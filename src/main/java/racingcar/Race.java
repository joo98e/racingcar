package racingcar;

import utils.StringUtils;
import view.Viewer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Race {
    public final List<Car> cars;
    public final int tryCount;

    public Race(List<Car> cars, int tryCount) {
        this.tryCount = tryCount;
        this.cars = cars;
    }

    public void racing() {
        for (int i = 0; i < tryCount; i++) {
            Viewer.printRaceRound(i + 1);
            cars.forEach(car -> {
                car.randomMove();
                Viewer.printMessage(car.getName() + " : " + StringUtils.convertTyphoonByNumber(car.getPosition()));
            });
        }
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();

        final Integer max = Collections.max(getAllPositionByCars(cars)); // get winner by position list
        cars.forEach(car -> {
            if (car.getPosition() == max) {
                winners.add(car);
            }
        });

        return winners;
    }

    public List<Integer> getAllPositionByCars(List<Car> cars) {
        return cars.stream().map(Car::getPosition).collect(Collectors.toList());
    }

    public String getWinnersName(List<Car> cars) {
        return cars.stream().map(Car::getName).collect(Collectors.joining(", "));
    }

}
