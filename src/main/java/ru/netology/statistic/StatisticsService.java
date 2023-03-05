

package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {              //рассчитать индекс макксимального дохода
        long current_max_index = 0;
        long current_max = incomes[0];

        for (long income : incomes)
            if (current_max < income)                 //массив дохода - incomes
                current_max = income;

        return current_max;                          //первое макксимальное значение

        }
    }
