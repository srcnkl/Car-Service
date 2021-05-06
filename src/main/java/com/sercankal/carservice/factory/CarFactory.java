package com.sercankal.carservice.factory;

import com.sercankal.carservice.exception.CarServiceException;
import com.sercankal.carservice.domain.Car;
import com.sercankal.carservice.enums.CarType;
import org.springframework.stereotype.Component;

import java.util.Locale;


@Component
public class CarFactory {

    public static Car createCar(String type) throws CarServiceException {
        CarType carType;
        try {
            carType = CarType.valueOf(type.toUpperCase(Locale.ENGLISH));
            return (Car) carType.getClazz().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new CarServiceException("Car cannot be found with given type " + type, 2500);
        }
    }
}
