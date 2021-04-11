package com.company.pushstyle;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends Subject<List<Integer>> {
    private List<Integer> dataSource = new ArrayList<>();

    public void addData(int data) {
        this.dataSource.add(data);
        this.notifyObservers(dataSource);
    }

    public void removeData(int data) {
        this.dataSource.remove(data);
        this.notifyObservers(dataSource);
    }

    public void updateData(int index, int data) {
        this.dataSource.set(index,data);
        this.notifyObservers(dataSource);
    }

}
