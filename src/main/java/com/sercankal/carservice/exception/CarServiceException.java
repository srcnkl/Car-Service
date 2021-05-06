package com.sercankal.carservice.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarServiceException extends Exception {

    private static final long serialVersionUID = 5041281841079302526L;

    private long errorCode;

    public CarServiceException(String mesage) {
        super(mesage);
        this.errorCode = Long.parseLong("0001");
    }

    public CarServiceException(String mesage, int errorCode) {
        super(mesage);
        if (errorCode < 0)
            errorCode *= -1;
        this.errorCode = Long.parseLong("" + errorCode);
    }
}
