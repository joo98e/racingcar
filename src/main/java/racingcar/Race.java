package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Race {
    public List<Car> cars = new ArrayList<Car>();

    public void initialize(String[] names) {
        Arrays.stream(names).forEach(this::accept);
    }

    /**
     * 이름을 통해 1개씩 cars 에 추가
     */
    public void addCarByName(String _name) {
        this.cars.add(new Car(_name));
    }

    private void accept(String name) {
        if (name.length() > 5) {
            System.out.println("글자 수는 5자 이하여야 합니다.");
            return;
        }

        this.addCarByName(name);
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
