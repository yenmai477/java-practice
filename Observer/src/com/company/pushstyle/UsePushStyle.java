package com.company.pushstyle;

import com.company.pushstyle.Chart;
import com.company.pushstyle.DataSource;
import com.company.pushstyle.TotalSheet;

public class UsePushStyle {
    public static void show() {
        //Init Concrete Subject
        com.company.pushstyle.DataSource dataSource = new DataSource();

        // Init Concrete Observer
        com.company.pushstyle.TotalSheet totalSheet = new TotalSheet();
        com.company.pushstyle.Chart chart = new Chart();

        // Add Subscribe
        dataSource.addObserver(totalSheet);
        dataSource.addObserver(chart);

        dataSource.addData(1);
        dataSource.addData(3);
        dataSource.addData(2);

        chart.display();
        totalSheet.display();

        dataSource.updateData(2,5);

        chart.display();
        totalSheet.display();
    }
}
