import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.markers.SeriesMarkers;

public class Example0 extends JFrame implements ActionListener  {
	public static void main(String[] args) throws Exception {

		// taking all inputs
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("PLEASE WRITE YOUR NAME ");
		String a= sc.next();
		System.out.println(" Enter the number of subjects you want");
		int b1 = sc.nextInt();
		System.out.println("Enter the subjects");
		String numCharts[] = new String[b1];
		for(int i=0;i<b1;i++)
		{
			numCharts[i]= sc1.nextLine();
		}
		System.out.println("NOW GO TO POPUP A/T RECORD !");
		sc.close();
		sc1.close();
		JLabel l = new JLabel(a+"'s "+"Matrix report");
		JButton b  = new JButton("Generate report");
		JFrame f=new JFrame(" Welcome to Chartreport of "+a);
		b.setBounds(80, 200,200, 30);
		l.setBounds(80,300,200,30);
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){ 
				{



					ArrayList<XYChart> charts = new ArrayList<XYChart>();
					// initializing the length
					for (int i = 0; i <numCharts.length; i++) {
						XYChart chart = new XYChartBuilder().xAxisTitle( "%Rate at which days incresed").yAxisTitle("Rate of class bunked").width(600).height(400).build();
						chart.getStyler().setYAxisMin((double) -10);
						chart.getStyler().setYAxisMax((double) 10);
						XYSeries series = chart.addSeries(""+ numCharts[i], null, getRandomWalk(70));
						series.setMarker(SeriesMarkers.NONE);
						charts.add(chart);
					}
					new SwingWrapper<XYChart>(charts).displayChartMatrix();
				}


			}

		});
		f.add(l);
		f.add(b);
		f.setSize(500,500);  
		f.setLayout(null);  
		f.setVisible(true);



	}

	private static double[] getRandomWalk(int numPoints) {

		double[] y = new double[numPoints];
		y[0] = 0;
		for (int i = 1; i < y.length; i++) {
			y[i] = y[i - 1] + Math.random() - .5;
		}
		return y;
	}



	public void actionPerformed(ActionEvent e) {



		// TODO Auto-generated method stub

	}}




