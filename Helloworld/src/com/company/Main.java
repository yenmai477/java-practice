package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        SumMultiThread sumMultiThread = new SumMultiThread();
        int result = sumMultiThread.multiThreadSum(10,4);
        System.out.println(result);

    }
}
