package com.company.pullstyle;


public class TotalSheet implements Observer, Display {
    private int sum;
    private DataSource dataSource;

    public TotalSheet(DataSource dataSource) {
        this.dataSource = dataSource;
        sum = dataSource
                .getDataSource()
                .stream()
                .reduce(0, (a, b) -> a + b);

    }


    @Override
    public void update() {
        sum = dataSource
                .getDataSource()
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
