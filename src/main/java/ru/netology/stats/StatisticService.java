package ru.netology.stats;

public class StatisticService {
    public int sumAllSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int sumAverageSales(int[] sales) {

        int sum = sumAllSales(sales);
        return sum / sales.length;
    }

    public int sumWithMonthMinSales(int[] sales) {
        int numberMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[numberMinMonth] >= sales[i]) {
                numberMinMonth = i;
            }
        }
        return numberMinMonth + 1;
    }

    public int sumWithMonthMaxSales(int[] sales) {
        int numberMaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[numberMaxMonth] <= sales[i]) {
                numberMaxMonth = i;
            }
        }
        return numberMaxMonth + 1;
    }

    public int monthLessThenAverageCount(int[] sales) {
        int average = sumAverageSales(sales);
        int amountOfMonth = 0;
        for (int sale : sales) {
            if (sale < average) {
                amountOfMonth++;
            }
        }
        return amountOfMonth;

    }

    public int monthHigherThenAverageCount(int[] sales) {
        int average = sumAverageSales(sales);
        int amountOfMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                amountOfMonth++;

            }
        }
        return amountOfMonth;
    }
}
