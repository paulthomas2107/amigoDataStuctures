package com.amigoscode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Log
public class HashCodeAndHashFunctions {

    public static void main(String[] args) {

        Map<Integer, Car> cars = new HashMap();

        cars.put(1, new Car(1, "Capri"));
        cars.put(2, new Car(2, "Escort"));
        cars.put(3, new Car(3, "Porsche"));
        cars.put(4, new Car(3, "Porsche"));

        log.info(String.valueOf(cars.get(3).hashCode()));
        log.info(String.valueOf(cars.get(4).hashCode()));

        cars.forEach((id, car) -> {
            log.info(car.toString());
        });

    }

}

@Data
@AllArgsConstructor
class Car {
    Integer id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id * new Date().getTime(), name);
    }
}