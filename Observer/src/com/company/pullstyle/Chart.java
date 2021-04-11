package com.company.pullstyle;

import java.util.ArrayList;
import java.util.List;

public class Chart implements Observer, Display {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public void update() {
//        System.out.println("Update data in chart!!!");
    }

    @Override
    public void display() {
        System.out.println("Display chart: " + dataSource.getDataSource());
    }
}
