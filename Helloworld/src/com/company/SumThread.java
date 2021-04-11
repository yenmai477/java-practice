package com.company;

public class SumThread  extends Thread{
    private int sum;
    private int start;
    private  int end;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum+= i;
        }

    }

    public int getSum() {
        return sum;
    }
}
