package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds() {


        long[] sales = {8, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long expectedDay = 8 + 15 + 13 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expectedDay, actual);
    }

    @Test
    public void shouldFindBetweenEnds2() {


        long[] sales = {8, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedDay = 8;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actual);
    }

    @Test
    public void shouldFindBetweenEnds3() {


        long[] sales = {8, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedDay = 7;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actual);
    }

    @Test
    public void shouldFindBetweenEnds4() {


        long[] sales = {8, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedDay = 15;
        int actual = (int) service.avgSales(sales);

        Assertions.assertEquals(expectedDay, actual);
    }

    @Test
    public void shouldFindBetweenEnds5() {


        long[] sales = {8, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedDay = 5;
        int actual = (int) service.moreThanAvgSales(sales);

        Assertions.assertEquals(expectedDay, actual);
    }

    @Test
    public void shouldFindBetweenEnds6() {


        long[] sales = {8, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedDay = 5;
        int actual = (int) service.lessThanAvgSales(sales);

        Assertions.assertEquals(expectedDay, actual);
    }
}



