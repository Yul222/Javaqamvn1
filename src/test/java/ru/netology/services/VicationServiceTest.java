package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//mport ru.netology.services.VicationService;

public class VicationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"

    })
    public void testVication (int count, int income, int expenses, int treshold) {
        VicationService service = new VicationService();
        int actual = service.calculate (income, expenses, treshold);

        Assertions.assertEquals (count, actual);

    }
}
