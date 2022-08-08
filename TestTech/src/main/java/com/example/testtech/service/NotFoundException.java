package com.example.testtech.service;

import java.lang.RuntimeException;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public class NotFoundException extends RuntimeException {


        public NotFoundException(String message) {
            super(message);
// TODO Auto-generated constructor stub
        }
    }
