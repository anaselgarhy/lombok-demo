package com.anas.learning.lombok;

import lombok.CustomLog;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 29/09/2022
 */
@CustomLog
class YoTest {
    private Yo yo;

    @BeforeEach
    void setUp() {
        yo = new Yo();
    }

    @Test
    void yo() {
        log.info("Testing yo()...");
        yo.yo();
        log.info("Done!");
    }

    @Test
    void add() {
        log.info("Testing add()...");
        yo.add(1, 2);
        log.info("Done!");
    }

    @Test
    void subtract() {
        log.info("Testing subtract()...");
        yo.subtract(1, 2);
        log.info("Done!");
    }

    @Test
    void sort() {
        val arr = new int[]{5, 5, 3 , 7, 8,6 , 78, 56};
        log.info("Testing sort()...");
        yo.sort(arr);
        log.info("Done!");
    }
}
