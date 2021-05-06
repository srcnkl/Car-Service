package com.sercankal.carservice.api;

import com.sercankal.carservice.exception.CarServiceException;
import org.springframework.util.StringUtils;

public class ControllerValidation {
    public void validateCreateCarPathVariable(String type) throws CarServiceException {
        if (StringUtils.isEmpty(type) || type.trim().isEmpty() || type.length() < 2)
            throw new CarServiceException("Car type is not valid", 1500);
    }
}
