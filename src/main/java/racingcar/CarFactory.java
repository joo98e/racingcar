package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public List<Car> createByNames(List<String> names) {
        List<Car> cars = new ArrayList<>();
        names.forEach(name -> {
            if (name.trim().equals("")) {
                return;
            }
            cars.add(new Car(name));
        });
        return cars;
    }

}
