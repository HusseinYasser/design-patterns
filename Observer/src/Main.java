import javax.swing.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //scheduler in java that runs on a single thread with the stochastic change every 10 seconds
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = new Runnable() {
            public void run() {
                concreteSubject.stochasticChange();
            }
        };
        scheduler.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);


        BarChart barChart = new BarChart(concreteSubject);
        barChart.setSize(800, 600);
        barChart.setLocationRelativeTo(null);
        barChart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        barChart.setVisible(true);

        PieChart pieChart = new PieChart(concreteSubject);
        pieChart.setSize(800, 600);
        pieChart.setLocationRelativeTo(null);
        pieChart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pieChart.setVisible(true);
    }
}
