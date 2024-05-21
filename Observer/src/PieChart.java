import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.*;

public class PieChart extends ApplicationFrame implements Observer {

    ConcreteSubject concreteSubject;
    DefaultPieDataset dataset = new DefaultPieDataset();

    void createDataset(int[] arr)
    {
        dataset.clear();

        for (int i = 0; i < arr.length; i++) {
            dataset.setValue("Category " + (i + 1), arr[i]);
        }
    }

    PieChart(ConcreteSubject concreteSubject)
    {
        super("Pie Chart Observer");
        this.concreteSubject = concreteSubject;
        //registering myself as an observer
        concreteSubject.registerObserver(this);
        drawChart();
    }

    public void drawChart()
    {
        JFreeChart chart = ChartFactory.createPieChart(
                "Pie Chart Example", // Chart Title
                dataset, // Dataset
                true, // Include legend
                true,
                false);

        chart.setBackgroundPaint(Color.white);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    @Override
    public void update() {
        //here is the pulling part of the data when the notification arrives
        createDataset(this.concreteSubject.getArr());
        repaint();
    }
}
