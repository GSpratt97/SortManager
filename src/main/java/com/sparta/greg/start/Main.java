package com.sparta.greg.start;

import com.sparta.greg.display.DisplayManager;
import com.sparta.greg.exceptions.ArrayLengthOutOfBounds;
import com.sparta.greg.exceptions.SorterLoaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger Logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws SorterLoaderException, ArrayLengthOutOfBounds {
        Logger.info("The program has been initialised!");
        DisplayManager.start();
    }
}
