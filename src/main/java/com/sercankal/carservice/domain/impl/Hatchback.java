package com.sercankal.carservice.domain.impl;

import com.sercankal.carservice.domain.Car;

public class Hatchback implements Car {

    @Override
    public String getType() {
        return "Hatchback Car has produced";
    }
}
