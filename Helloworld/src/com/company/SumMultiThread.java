package com.company;

import java.util.ArrayList;
import java.util.List;

public class SumMultiThread {
    public int  multiThreadSum (int n, int numberOfThread) {
        int base = n / numberOfThread;
        int start = 0;
        int end = 0;

        List<SumThread> sumThreadList = new ArrayList<>();

        for (int i = 0; i < numberOfThread; i++) {
            end = (i == numberOfThread - 1) ? n : start + base;
            sumThreadList.add(new SumThread(start, end));
            start = end + 1;
        }

        for (SumThread sumThread: sumThreadList) {
            sumThread.start();
            System.out.println(sumThread.getName());

        }

        for (SumThread sumThread: sumThreadList) {
            try {
                sumThread.join();
            } catch (InterruptedException e) {

            }
        }

        int result = sumThreadList.stream()
                .mapToInt(thread -> thread.getSum())
                .sum();

        return result;

    }
}
