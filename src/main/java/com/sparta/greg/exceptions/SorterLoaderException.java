package com.sparta.greg.exceptions;

public class SorterLoaderException extends Exception {
    @Override
    public String getMessage() {
        return "Error picking sorter! Please pick sorter from list provided.";
    }
}
