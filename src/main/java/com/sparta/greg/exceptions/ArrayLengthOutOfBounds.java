package com.sparta.greg.exceptions;

public class ArrayLengthOutOfBounds extends Exception {
    @Override
    public String getMessage() {
        return "Value is out of bounds, please enter a value between 1 and 99_999_999!";
    }
}
