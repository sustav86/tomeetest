package com.sustav.producer;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

import com.sustav.entity.Car;

public class CarProducer {

    @Produces
    public Car getCar() {
        return new Car("Lada kolina");
    }

    public void clean(@Disposes Car car) {
        car.clean();
    }
}
