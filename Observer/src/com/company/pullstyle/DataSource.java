package com.company.pullstyle;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends Subject {
    private List<Integer> dataSource = new ArrayList<>();

    public List<Integer> getDataSource() {
        return dataSource;
    }


    public void addData(int data) {
        this.dataSource.add(data);
        this.notifyObservers();
    }

    public void removeData(int data) {
        this.dataSource.remove(data);
        this.notifyObservers();
    }

    public void updateData(int index, int data) {
        this.dataSource.set(index,data);
        this.notifyObservers();
    }

}
