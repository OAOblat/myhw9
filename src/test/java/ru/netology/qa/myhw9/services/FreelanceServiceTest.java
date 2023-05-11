package ru.netology.qa.myhw9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelanceServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/freelance.csv")

    public void shouldCalcMonth(int expected, int income, int expences, int threshold) {
        FreelanceService service = new FreelanceService();

        int actual = service.calcMonthOfRest(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }


}
