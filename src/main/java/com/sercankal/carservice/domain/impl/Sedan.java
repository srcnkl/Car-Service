package com.sercankal.carservice.domain.impl;

import com.sercankal.carservice.domain.Car;

public class Sedan implements Car {

    @Override
    public String getType() {
        return "Sedan Car has produced";
    }
}
