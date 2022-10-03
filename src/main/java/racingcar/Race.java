package racingcar;

import utils.GlobalUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Race {
    public List<Car> cars = new ArrayList<>();
    public int tryCount;

    public Race(String[] names, int initialTryCount) {
        this.initialize(names);
        this.tryCount = initialTryCount;
    }

    public void initialize(String[] names) {
        Arrays.stream(names).forEach(name -> {
            if (name.length() > 5) {
                GlobalUtils.printErrorMessage("자동차의 이름은 5자 이하여야 합니다. 초과된 자동차 이름 : " + name);
                System.exit(0);
                return;
            }

            this.addCarByName(name);
        });
    }

    /**
     * 이름을 통해 1개씩 cars 에 추가
     */
    public void addCarByName(String _name) {
        this.cars.add(new Car(_name));
    }


    public List<Car> getCars() {
        return this.cars;
    }
}
