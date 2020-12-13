package com.sparta.greg.exceptions;

import com.sparta.greg.display.DisplayManager;
import org.apache.logging.log4j.LogManager;

public class SorterLoaderException extends Exception {
    private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger(SorterLoaderException.class);

    @Override
    public String getMessage() {
        Logger.error("Error picking sorter! Please pick sorter from list provided.");
        return "Error picking sorter! Please pick sorter from list provided.";
    }
}
