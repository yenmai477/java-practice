package com.company;

public class CloudStream implements  Stream{
    @Override
    public String write(String data) {
        return "Storing " + data;
    }
}
