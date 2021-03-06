package gradeshistogram;

import java.io.File;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * @purpose This class represents a histogram generator for grades using 
 * JFreeChart Library. 
 * @author Marietta Lazana
 * @version 1.0
 */
public class HistogramGenerator {

	/***
	 * Reads a file with grades from command line and storage it to an array
	 * according to their frequency. Finally, it calls a method to present the
	 * results.
	 * 
	 * @param File with grades
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File(args[0]));
		
		int[] grades = new int[11];
		/*
		 * For each grade it counts frequency. In terms of the assignment 
		 * grades would surely be [0,10]. 
		 */
		while (sc.hasNextInt()) {
			grades[sc.nextInt()] += 1;
		}
		generateChart(grades);
	}

	/***
	 * Receives a single dimension Integer array. From this array the dataset that
	 * will be used for the visualization is generated. Finally, The chart is
	 * generated with the use of the aforementioned dataset and then presented in
	 * the screen.
	 * 
	 * @param dataValues Single dimension integer array
	 * @author Gkortzis Antonis
	 */
	public static void generateChart(int[] dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that can be
		 * visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many series in
		 * one dataset.
		 */
		XYSeries data = new XYSeries("random values");

		/*
		 * Populating the XYSeries data object from the input Integer array values.
		 */
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Chart title", "x_axis title", "y_axis_title", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the previously
		 * created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);

	}
}
