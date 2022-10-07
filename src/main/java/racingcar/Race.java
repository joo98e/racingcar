package racingcar;

import java.util.List;

public class Race {
    public List<Car> cars;
    public int tryCount;

    public Race(int tryCount) {
        this.tryCount = tryCount;
    }

    public int getTryCount() {
        return tryCount;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
