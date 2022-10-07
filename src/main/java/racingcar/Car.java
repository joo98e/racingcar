package racingcar;

import Excemtion.CarException;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        if (name.length() > 5) {
            throw new CarException("이름은 5자 이하이어야 합니다.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int setPosition(int position) {
        this.position = position;
        return this.position;
    }

    public int updateStatus(int nextNum) {
        if (nextNum >= 4) {
            return setPosition(getPosition() + 1);
        }
        return setPosition(getPosition() - 1);
    }

}
