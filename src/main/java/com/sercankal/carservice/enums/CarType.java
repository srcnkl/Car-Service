package com.sercankal.carservice.enums;

import com.sercankal.carservice.domain.impl.Cabrio;
import com.sercankal.carservice.domain.impl.Hatchback;
import com.sercankal.carservice.domain.impl.Sedan;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CarType {

    SEDAN("sedan", Sedan.class),
    CABRIO("cabrio", Cabrio.class),
    HATCHBACK("hatchback", Hatchback.class);

    private String label;
    private Class<?> clazz;

}
