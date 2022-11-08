package ru.netology.sqr;

public class SQRService {
    public int calculate(int downLimit, int upLimit) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int sqr = i * i;
            for (int a = downLimit; a <= upLimit; a++) {
                if (sqr == a) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
