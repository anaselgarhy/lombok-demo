package com.anas.learning.lombok;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 29/09/2022
 */
@Slf4j // requires additional dependency
public class Yo {
    public void yo() {
        log.info("Yo!");
    }

    public void add(int a, int b) {
        log.info("a + b = {}", a + b);
    }

    public void subtract(int a, int b) {
        log.info("a - b = {}", a - b);
    }

    public void sort(int[] arr) {
        Arrays.sort(arr);
        log.info("Sorted array: {}", arr);
    }
}
