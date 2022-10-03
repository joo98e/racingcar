package racingcar;

import java.util.Arrays;
import java.util.List;

public class Race {
    public List<Car> cars;

    public void initialize(String[] names) {
        Arrays.stream(names).forEach(this::addCarByName);
    }

    public void addCarByName(String _name) {
        this.cars.add(new Car(_name));
    }

    public List<Car> getCars() {
        return this.cars;
    }

}
