package com.sercankal.carservice.api;

import com.sercankal.carservice.exception.CarServiceException;
import com.sercankal.carservice.factory.CarFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class CarController extends ControllerValidation {

    @GetMapping({"/{type}"})
    public ResponseEntity<String> createCar(@PathVariable("type") String type) throws CarServiceException {
        validateCreateCarPathVariable(type);
        var car = CarFactory.createCar(type);
        return ResponseEntity.ok(car.getType());
    }

}
