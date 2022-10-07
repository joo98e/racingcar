package racingcar;

import utils.RandomUtils;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Race {
    public List<Car> cars;
    public int tryCount;

    public Race(int tryCount) {
        this.tryCount = tryCount;
    }

    public void racing() {
        int labs = 0;
        while (tryCount != 0) {
            System.out.println("=====================");
            System.out.println(++labs + "회차 실행 결과");
            cars.forEach(car -> {
                int randomValue = RandomUtils.nextInt(0, 9);
                car.updateStatus(randomValue);
                System.out.println(car.getName() + " : " + StringUtils.convertTyphoonByNumber(car.getPosition()));
            });
            setTryCount(tryCount - 1);
        }
    }

    public List<Integer> getAllPositionByCars(List<Car> cars) {
        return cars.stream().map(Car::getPosition).collect(Collectors.toList());
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>(); // return type

        final List<Integer> allPositionByCars = getAllPositionByCars(cars); // position value list
        final Integer max = Collections.max(allPositionByCars); // get winner by position list

        cars.forEach(car -> {
            if (car.getPosition() == max) {
                winners.add(car);
            }
        });

        return winners;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
