package com.company.pullstyle;



public class UsePullStyle {
    public static void show() {
        //Init Concrete Subject
        DataSource dataSource = new DataSource();

        // Init Concrete Observer
        TotalSheet totalSheet = new TotalSheet(dataSource);
        Chart chart = new Chart(dataSource);

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
