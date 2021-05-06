package com.sercankal.carservice.domain.impl;

import com.sercankal.carservice.domain.Car;

public class Cabrio implements Car {

    @Override
    public String getType() {
        return "Cabrio Car has produced";
    }
}
