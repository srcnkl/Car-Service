package com.sercankal.carservice.factory;

import com.sercankal.carservice.api.ControllerValidation;
import com.sercankal.carservice.exception.CarServiceException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ControllerValidationTest {

    @InjectMocks
    ControllerValidation controllerValidation;

    private static final String responseForNotValidType = "Car type is not valid";

    @Test
    public void whenTypeIsValid() throws CarServiceException {
        String type = "sedan";
        Assertions.assertDoesNotThrow(() -> {
            controllerValidation.validateCreateCarPathVariable(type);
        });
    }

    @Test
    public void whenTypeIsNull() throws CarServiceException {
        String type = null;
        CarServiceException exception = Assertions.assertThrows(CarServiceException.class, () -> {
            controllerValidation.validateCreateCarPathVariable(type);
        });
        Assertions.assertEquals(exception.getMessage(), responseForNotValidType);
        Assertions.assertEquals(exception.getErrorCode(), 1500);
    }

    @Test
    public void whenTypeIsEmpty() throws CarServiceException {
        String type = "";
        CarServiceException exception = Assertions.assertThrows(CarServiceException.class, () -> {
            controllerValidation.validateCreateCarPathVariable(type);
        });
        Assertions.assertEquals(exception.getMessage(), responseForNotValidType);
        Assertions.assertEquals(exception.getErrorCode(), 1500);
    }

    @Test
    public void whenTypeLengthIsLessThan2() throws CarServiceException {
        String type = "x";
        CarServiceException exception = Assertions.assertThrows(CarServiceException.class, () -> {
            controllerValidation.validateCreateCarPathVariable(type);
        });
        Assertions.assertEquals(exception.getMessage(), responseForNotValidType);
        Assertions.assertEquals(exception.getErrorCode(), 1500);
    }

    @Test
    public void whenTypeHasWhiteSpaceChar() throws CarServiceException {
        String type = " ";
        CarServiceException exception = Assertions.assertThrows(CarServiceException.class, () -> {
            controllerValidation.validateCreateCarPathVariable(type);
        });
        Assertions.assertEquals(exception.getMessage(), responseForNotValidType);
        Assertions.assertEquals(exception.getErrorCode(), 1500);
    }
}
