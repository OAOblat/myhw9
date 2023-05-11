package ru.netology.qa.myhw9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelanceServiceTest {

    @Test
    public void shouldCalcMonth() {
        FreelanceService service = new FreelanceService();

        int expected = 2;
        int actual = service.calcMonthOfRest(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }


}
