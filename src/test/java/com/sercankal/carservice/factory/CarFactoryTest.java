package com.sercankal.carservice.factory;

import com.sercankal.carservice.enums.CarType;
import com.sercankal.carservice.exception.CarServiceException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarFactoryTest {

    private static final String responseForSedan = "Sedan Car has produced";
    private static final String responseForCabrio = "Cabrio Car has produced";
    private static final String responseForHatchback = "Hatchback Car has produced";
    private static final String responseForNotExistCarType = "Car cannot be found with given type ";

    @Test
    public void whenCarTypeIsSedan() throws CarServiceException {
        String type = "sedan";
        var car = CarFactory.createCar(type);
        Assertions.assertEquals(car.getClass(), CarType.SEDAN.getClazz());
        Assertions.assertEquals(car.getType(), responseForSedan);
    }

    @Test
    public void whenCarTypeIsCabrio() throws CarServiceException {
        String type = "cabrio";
        var car = CarFactory.createCar(type);
        Assertions.assertEquals(car.getClass(), CarType.CABRIO.getClazz());
        Assertions.assertEquals(car.getType(), responseForCabrio);
    }

    @Test
    public void whenCarTypeIsHatchback() throws CarServiceException {
        String type = "hatchback";
        var car = CarFactory.createCar(type);
        Assertions.assertEquals(car.getClass(), CarType.HATCHBACK.getClazz());
        Assertions.assertEquals(car.getType(), responseForHatchback);
    }

    @Test
    public void whenCarTypeIsNotExist() {
        String type = "suv";
        CarServiceException exception = Assertions.assertThrows(CarServiceException.class, () -> {
            CarFactory.createCar(type);
        });
        Assertions.assertEquals(exception.getMessage(), responseForNotExistCarType.concat(type));
        Assertions.assertEquals(exception.getErrorCode(), 2500);
    }


}
