package ru.netology.sqr;

public class SQRService {
    public int calculate(int downLimit, int upLimit) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int sqr = i * i;
            if (sqr >= downLimit && sqr <= upLimit) {
                count = count + 1;
            }
        }
        return count;
    }
}
