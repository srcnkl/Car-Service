package com.sercankal.carservice.exception;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {

    private long code;
    private String message;

}
