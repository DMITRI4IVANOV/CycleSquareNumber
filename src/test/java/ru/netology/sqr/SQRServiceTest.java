package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sholdCalcSqrt() {
        SQRService service = new SQRService ();
        int actual = service.calcSqrt(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }
}