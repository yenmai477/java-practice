package com.company;

import com.company.pullstyle.UsePullStyle;
import com.company.pushstyle.Chart;
import com.company.pushstyle.DataSource;
import com.company.pushstyle.TotalSheet;
import com.company.pushstyle.UsePushStyle;

public class Main {

    public static void main(String[] args) {
        UsePushStyle.show();
        System.out.println("==============================");
        UsePullStyle.show();
    }
}
