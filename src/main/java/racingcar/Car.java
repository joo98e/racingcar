package racingcar;

import exception.carExceptionHandler.CarException;
import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        if (name.length() > 5) {
            throw new CarException("이름은 5자 이하이어야 합니다.");
        }
        this.name = name;
    }

    public void randomMove() {
        if (RandomUtils.nextInt(0, 9) < 4) {
            return;
        }
        setPosition(getPosition() + 1);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
