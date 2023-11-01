package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarManager {

    private List<RacingCar> cars;

    public RacingCarManager(List<String> carNames) {
        this.cars = new ArrayList<>();

        for (String carName: carNames) {
            cars.add(new RacingCar(carName));
        }
    }
}