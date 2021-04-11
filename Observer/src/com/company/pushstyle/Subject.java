package com.company.pushstyle;

import java.util.ArrayList;
import java.util.List;

public class Subject <T>{
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public  void notifyObservers(T o) {
        for (Observer observer: observerList) {
            observer.update(o);
        }
    }
}
