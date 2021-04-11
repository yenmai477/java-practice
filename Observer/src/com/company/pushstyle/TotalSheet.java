package com.company.pushstyle;

import java.util.List;

public class TotalSheet implements Observer<List<Integer>>, Display{

    private  int sum;

    @Override
    public void update(List<Integer> dataSource) {
         sum = dataSource
                .stream()
                .reduce(Integer::sum).get();

    }

    public int getSum() {
        return sum;
    }

    @Override
    public void display() {
        System.out.println("Display sum:" + sum);
    }
}
