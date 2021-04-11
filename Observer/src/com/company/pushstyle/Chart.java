package com.company.pushstyle;

import java.util.ArrayList;
import java.util.List;

public class Chart implements Observer<List<Integer>> , Display{
    List<Integer> dataSource = new ArrayList<>();
    @Override
    public void update(List<Integer> dataSource) {
       this.dataSource = dataSource;
    }

    @Override
    public void display() {
        System.out.println("Display chart: " + dataSource);
    }
}
