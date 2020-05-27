package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumAllSales() {
        StatisticService service = new StatisticService();
        int expected = 180;
        int actual = service.sumAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void sumAverageSales() {
        StatisticService service = new StatisticService();
        int expected = 15;
        int actual = service.sumAverageSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void sumWhithMomthMinSales() {
        StatisticService servise = new StatisticService();
        int expected = 9;
        int actual = servise.sumWithMonthMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void sumWhithMomthMaxSales() {
        StatisticService servise = new StatisticService();
        int expected = 8;
        int actual = servise.sumWithMonthMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthLessThenAverageCount() {
        StatisticService servise = new StatisticService();
        int expected = 5;
        int actual = servise.monthLessThenAverageCount(sales);
        assertEquals(expected, actual);

    }

    @Test
    void monthHigherThenAverageCount() {
        StatisticService servise = new StatisticService();
        int expected = 5;
        int actual = servise.monthLessThenAverageCount(sales);
        assertEquals(expected, actual);

    }
}