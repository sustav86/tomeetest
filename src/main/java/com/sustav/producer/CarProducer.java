package com.sustav.producer;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

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
