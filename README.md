# Data-Analysis-using-Xchart-Library

It is a Java free library which helps in creating Analytical tables

![Image of Yaktocat](https://knowm.org/wp-content/uploads/XChart-Example-2-1024x645.png)

# Download the module with the given link:

  https://knowm.org/downloads/xchart/xchart-3.8.0.zip

#Code Snippet:

  ```
      /**
 * Creates a simple Chart using QuickChart
 */
public class Example0 {
 
  public static void main(String[] args) throws Exception {
 
    double[] xData = new double[] { 0.0, 1.0, 2.0 };
    double[] yData = new double[] { 2.0, 1.0, 0.0 };
 
    // Create Chart
    XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);
 
    // Show it
    new SwingWrapper(chart).displayChart();
 
  }
}
```
