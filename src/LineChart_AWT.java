
import static java.awt.Color.blue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;



public class LineChart_AWT extends JFrame {
    
    public String q = "a"+Student_Options.roll.getText();

   public LineChart_AWT( String applicationTitle , String chartTitle) {
      
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Tests","Your Score",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
      //lineChart.setBackgroundPaint(blue);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      
    
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( ) {
       ArrayList<Test_Marks> list = universal.getList4(q);
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      {
          for(int i=0;i<list.size();i++)
        {
            int m=list.get(i).getscore();
            //System.out.println(m);
            dataset.addValue(m, "Tests",""+(i+1));
            
        }
      }
      
      return dataset;
   }
}
