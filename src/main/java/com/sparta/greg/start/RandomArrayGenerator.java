package com.sparta.greg.start;

import com.sparta.greg.exceptions.ArrayLengthOutOfBounds;

import java.util.Random;

import org.apache.logging.log4j.LogManager;

public class RandomArrayGenerator {
    private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger(RandomArrayGenerator.class);
    public static int[] generateArray (int lengthOfArray) throws ArrayLengthOutOfBounds {
        if(lengthOfArray < 0) {
            Logger.error("Length of array is negative! Value entered: " + lengthOfArray);
            throw new ArrayLengthOutOfBounds();
        } else if(lengthOfArray == 0){
            Logger.error("Length of array is zero!");
            throw new ArrayLengthOutOfBounds();
        } else if (lengthOfArray > 99_999_999) {
            Logger.error("Length of array is greater than 99_999_999! Value entered: "+lengthOfArray);
            throw new ArrayLengthOutOfBounds();
        } else if (lengthOfArray > 99_999) {
            Logger.warn("Length of array is greater than 99_999! Value entered: "+lengthOfArray);
        }
        int[] array = new int[lengthOfArray];
        Random random = new Random();
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] += random.nextInt(100) + 1;
        }
        return array;
    }
}
