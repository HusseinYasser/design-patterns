import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class BarChart extends JFrame implements Observer {

    //injecting the observable to pull the data
    ConcreteSubject concreteSubject;
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    BarChart(ConcreteSubject concreteSubject) {
        super("Bar Chart Observer");
        this.concreteSubject = concreteSubject;
        concreteSubject.registerObserver(this);

        createDataset(concreteSubject.getArr());
        drawChart();
    }

    void createDataset(int[] arr) {
        dataset.clear();
        for (int i = 0; i < arr.length; ++i) {
            dataset.addValue(arr[i], "Category " + i, "Label " + i);
        }
    }

    public void drawChart() {

        JFreeChart chart = ChartFactory.createBarChart(
                "Bar Chart Observer",
                "Category",
                "Score",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        System.out.println(dataset);
        chart.setBackgroundPaint(Color.white);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    @Override
    public void update() {
        //draw the chart again once update is received
        createDataset(this.concreteSubject.getArr());
        repaint();
    }

}
